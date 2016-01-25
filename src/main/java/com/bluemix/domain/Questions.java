package com.bluemix.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Questions {

	private List<Question> question;

	@XmlElement(name = "Question")
	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}
}