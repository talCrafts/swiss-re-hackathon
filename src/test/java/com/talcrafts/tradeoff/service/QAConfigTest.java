package com.talcrafts.tradeoff.service;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.bluemix.domain.Categories;

import junit.framework.Assert;

public class QAConfigTest 
{
	
	@Test
	public void testQAConfig() throws JAXBException
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(Categories.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
	    //We had written this file in marshalling example
	    Categories categories = (Categories) jaxbUnmarshaller.unmarshal( new File("src/main/resources/QAConfiguration.xml"));
	    Assert.assertTrue("size is not correct", categories.getCategory().size()==2);
	}
}
