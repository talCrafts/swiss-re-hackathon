package com.bluemix.domain;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;

public class Question {
	
	private String questionText;
	private BigDecimal questionWeight;
	private AnswerSet answerSet;

	@XmlElement(name = "QuestionText")
	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	@XmlElement(name = "QuestionWeight")
	public BigDecimal getQuestionWeight() {
		return questionWeight;
	}

	public void setQuestionWeight(BigDecimal questionWeight) {
		this.questionWeight = questionWeight;
	}

	@XmlElement(name = "AnswerSet")
	public AnswerSet getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(AnswerSet answerSet) {
		this.answerSet = answerSet;
	}
}