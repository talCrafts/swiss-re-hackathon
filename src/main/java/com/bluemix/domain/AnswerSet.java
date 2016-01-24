package com.bluemix.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class AnswerSet {

	private String answerType;
	private List<Answer> answers;

	@XmlElement(name = "AnswerType")
	public String getAnswerType() {
		return answerType;
	}

	public void setType(String answerType) {
		this.answerType = answerType;
	}

	@XmlElement(name = "Answer")
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}