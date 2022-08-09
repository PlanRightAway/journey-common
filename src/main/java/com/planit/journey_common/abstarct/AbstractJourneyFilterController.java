package com.planit.journey_common.abstarct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.planit.journey_common.endpoint.JourneyFilterController;
import com.planit.journey_common.model.PlanCriteria;

public abstract class AbstractJourneyFilterController implements JourneyFilterController {

	private final Map<String, List<String>> subFiltersServices = new HashMap<>();
	
	private final Map<Long, PlanCriteria> planCriteriaMap = new HashMap<>();
	
	protected void addSubFilterService(String value, String filterServiceName) {
		if(null == subFiltersServices.get(value)) {
			subFiltersServices.put(value, new ArrayList<String>());
		}
		subFiltersServices.get(value).add(filterServiceName);
	}

	@Override
	public void registerPlan(Long planId, PlanCriteria planCriteria) {
		planCriteriaMap.put(planId, planCriteria);		
	}

	@Override
	public List<String> getSubFilters(String value) {
		return subFiltersServices.get(value);
	}
	
	protected PlanCriteria getCriteria(Long planId) {
		return planCriteriaMap.get(planId);
	}
	
	

}
