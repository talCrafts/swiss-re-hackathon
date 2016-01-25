package com.bluemix.services;

import org.junit.Test;

import com.bluemix.domain.Categories;

import junit.framework.Assert;

public class QuestionnaireServiceTest {

	QuestionaireService questionnaireService = new QuestionaireServiceImpl();

	@Test
	public void testQuestionnaire() {
		Categories categories = questionnaireService.getQuestionaire();
		Assert.assertEquals(3, categories.getCategory().size());
	}
}
