package com.planit.journey_common.servicecommon;

import com.planit.journey_common.model.PlanCriteria;

public interface AbstractServiceInterface {

	public void registerPlan(Long planId, PlanCriteria planCriteria);
	
}
