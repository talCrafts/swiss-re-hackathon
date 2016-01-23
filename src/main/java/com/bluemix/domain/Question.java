package com.bluemix.domain;

public class Question {

	private String code;
	private String text;
	private AnswerSet answerSet;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public AnswerSet getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(AnswerSet answerSet) {
		this.answerSet = answerSet;
	}
}
