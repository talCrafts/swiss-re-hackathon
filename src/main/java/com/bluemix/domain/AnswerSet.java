package com.bluemix.domain;

import java.util.List;

public class AnswerSet {

	private List<Answer> answers;
	private String type;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
