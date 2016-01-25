package com.bluemix.services;

import com.bluemix.domain.Categories;
import com.bluemix.domain.Category;
import com.bluemix.domain.CategoryCode;

public interface QuestionaireService {

	/**
	 * Get questions for category Code.
	 * 
	 * @param categoryCode
	 * @return
	 */
	Category getQuestionaire(CategoryCode categoryCode);
	
	/**
	 * 
	 * Get all questions for categories
	 * 
	 * @return
	 */
	Categories getQuestionaire();
}
