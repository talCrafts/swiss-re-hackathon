package com.bluemix.domain;

import java.util.HashMap;
import java.util.Map;

public class PersonalRisk {

	Map<String, CategoryScore> scores = new HashMap<String, CategoryScore>();

	public void addRisk(CategoryScore categoryScore) {
		scores.put(categoryScore.getCategoryCode(), categoryScore);
	}

	public CategoryScore getCategoryRisk(String categoryCode) {
		return scores.get(categoryCode);
	}
}
