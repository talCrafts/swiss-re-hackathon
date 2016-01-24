package com.bluemix.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Category {
	
	private String categoryName;
	private List<Questions> questions;

	@XmlElement(name = "CategoryName")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@XmlElement(name = "Questions")
	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
}