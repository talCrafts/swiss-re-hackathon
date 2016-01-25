package com.bluemix.services;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.bluemix.domain.Answer;
import com.bluemix.domain.AnswerSet;
import com.bluemix.domain.Categories;
import com.bluemix.domain.Category;
import com.bluemix.domain.CategoryScore;
import com.bluemix.domain.PersonalRisk;
import com.bluemix.domain.Question;

import junit.framework.Assert;

public class RiskCalculatorTest {

	RiskCalculator riskCalculator = new RiskCalculatorService();
	
	@Test
	public void testRisk() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Categories.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		// We had written this file in marshalling example
		Categories categories = (Categories) jaxbUnmarshaller.unmarshal(new File("src/main/resources/RiskCalc.xml"));
		Assert.assertTrue("size is not correct", categories.getCategory().size() == 2);

		PersonalRisk personRisk = riskCalculator.getRisk(categories);
		Assert.assertEquals(BigDecimal.valueOf(0.72), personRisk.getCategoryRisk("HEALTH").getScore());
		Assert.assertEquals(BigDecimal.valueOf(0.42), personRisk.getCategoryRisk("FINANCIAL").getScore());
	}

	
}
