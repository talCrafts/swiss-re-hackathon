package com.bluemix.domain;

import java.math.BigDecimal;

public class Questions {

	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public AnswerSet getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(AnswerSet answerSet) {
		this.answerSet = answerSet;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	private AnswerSet answerSet;
	private BigDecimal weight;
	private BigDecimal score;
}
