package com.bluemix.domain;

import java.math.BigDecimal;

public class Answer {

	private String text;
	private String code;
	private BigDecimal weight;
	private Boolean isAnswer;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Boolean getIsAnswer() {
		return isAnswer;
	}

	public void setIsAnswer(Boolean isAnswer) {
		this.isAnswer = isAnswer;
	}

}
