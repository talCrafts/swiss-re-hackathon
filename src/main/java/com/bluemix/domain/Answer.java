package com.bluemix.domain;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Answer {

	private String answerText;
	private BigDecimal answerWeight;
	private boolean isSelected;
	
	@XmlElement(name = "AnswerText")
	public String getAnswerText() {
		return answerText;
	}
	
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	
	@XmlElement(name = "AnswerWeight")
	public BigDecimal getAnswerWeight() {
		return answerWeight;
	}
	
	public void setAnswerWeight(BigDecimal answerWeight) {
		this.answerWeight = answerWeight;
	}

	@XmlElement(name = "IsSelected")
	public boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
}