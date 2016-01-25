package com.bluemix.services;

import com.bluemix.domain.Categories;
import com.bluemix.domain.PersonalRisk;

public interface RiskCalculator {

	PersonalRisk getRisk(Categories categories);
}
