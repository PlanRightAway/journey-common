package com.planit.journey_common.endpoint.common;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planit.journey_common.model.PlanCriteria;

public interface AbstractEndpointInterface {

	@PostMapping("/registerPlan")
	void registerPlan(@RequestParam Long planId, @RequestBody PlanCriteria planCriteria);

}
