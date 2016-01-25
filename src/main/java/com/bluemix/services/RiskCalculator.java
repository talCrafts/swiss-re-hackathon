package com.bluemix.services;

import java.util.List;

import com.bluemix.domain.Categories;
import com.bluemix.domain.PersonalRisk;

public interface RiskCalculator {

	PersonalRisk getRisk(List<Categories> categories);
}
