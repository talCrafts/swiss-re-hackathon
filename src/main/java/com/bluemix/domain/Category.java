package com.bluemix.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Category {
	
	private String categoryName;
	private List<Question> questions;

	@XmlElement(name = "CategoryName")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@XmlElement(name = "Questions")
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}