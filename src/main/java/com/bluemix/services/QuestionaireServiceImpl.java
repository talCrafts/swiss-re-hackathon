package com.bluemix.services;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bluemix.domain.Categories;
import com.bluemix.domain.Category;
import com.bluemix.domain.CategoryCode;

public class QuestionaireServiceImpl implements QuestionaireService {

	@Override
	public Category getQuestionaire(CategoryCode categoryCode) {
		return null;
	}

	@Override
	public Categories getQuestionaire(){
		Categories categories = new Categories();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Categories.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			categories = (Categories) jaxbUnmarshaller.unmarshal(new File("src/main/resources/Configuration.xml"));
		} catch (JAXBException jaxBException) {
			System.out.println("Need to put logger");
		}
		return categories;
	}

}
