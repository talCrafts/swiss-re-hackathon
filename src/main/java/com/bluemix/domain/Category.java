package com.bluemix.domain;

import javax.xml.bind.annotation.XmlElement;

public class Category {
	
	private String categoryCode;
	private String categoryName;
	private Questions questions;
	

	@XmlElement(name = "CategoryCode")
	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}


	@XmlElement(name = "CategoryName")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@XmlElement(name = "Questions")
	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
}