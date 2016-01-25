package com.bluemix.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluemix.domain.Answer;
import com.bluemix.domain.AnswerSet;
import com.bluemix.domain.Categories;
import com.bluemix.domain.Category;
import com.bluemix.domain.CategoryScore;
import com.bluemix.domain.PersonalRisk;
import com.bluemix.domain.Question;

@Service
public class RiskCalculatorService implements RiskCalculator{
	private static final BigDecimal HUNDERD = BigDecimal.valueOf(100);

	@Override
	public PersonalRisk getRisk(Categories categories) {
		PersonalRisk personalRisk = new PersonalRisk();
		for (Category category : categories.getCategory()) {
			BigDecimal categoryScore = categoryScore(category);
			CategoryScore categorySummary = new CategoryScore(category.getCategoryCode());
			categorySummary.setScore(categoryScore);
			personalRisk.addRisk(categorySummary);
		}
		return personalRisk;
	}

	private BigDecimal categoryScore(Category category) {
		BigDecimal categoryScore = BigDecimal.ZERO;
		for (Question question : category.getQuestions().getQuestion()) {
			AnswerSet answerSet = question.getAnswerSet();
			BigDecimal questionWeight = question.getQuestionWeight();
			List<Answer> answers = answerSet.getAnswers();
			BigDecimal questionScore = questionScore(questionWeight, answers);
			categoryScore = categoryScore.add(questionScore);
		}
		return categoryScore;
	}

	private BigDecimal questionScore(BigDecimal questionWeight, List<Answer> answers) {
		BigDecimal questionScore = BigDecimal.ZERO;
		for (Answer answer : answers) {
			if (answer.getIsSelected()) {
				questionScore = questionScore
						.add(questionWeight.divide(HUNDERD).multiply(answer.getAnswerWeight().divide(HUNDERD)));
			}
		}
		return questionScore;
	}
}
