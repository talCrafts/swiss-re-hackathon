package com.jsf.demo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class DemoController {

	private DemoModel demoModel = new DemoModel();
	private List<Recommendation> recommendations = new ArrayList<Recommendation>();

	@ManagedProperty(value = "#{demoService}")
	private DemoService demoService;

	public void setDemoModel(DemoModel demoModel) {
		this.demoModel = demoModel;
	}

	public DemoModel getDemoModel() {
		return demoModel;
	}

	public List<Recommendation> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	public DemoService getDemoService() {
		return demoService;
	}

	public void submit() {
		recommendations = demoService.calculateRisk(demoModel);
	}

}
