package com.bluemix.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "category")
public class Category {

	private String name;
	private String code;
	private List<QuestionAnswer> questions;
	private BigDecimal score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<QuestionAnswer> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionAnswer> questions) {
		this.questions = questions;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}
}
