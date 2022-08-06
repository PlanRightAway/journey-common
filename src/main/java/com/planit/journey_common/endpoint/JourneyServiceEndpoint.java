package com.planit.journey_common.endpoint;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planit.journey_common.endpoint.common.AbstractEndpointInterface;
import com.planit.journey_common.model.Journey;
import com.planit.journey_common.model.PlanCriteria;
import com.planit.journey_common.model.RoutePointBean;

public interface JourneyServiceEndpoint extends AbstractEndpointInterface {
	
	@PostMapping("/getJourneyRoutePoints")
	List<Journey> getJourneyRoutePoints(@RequestBody RoutePointBean routePointBean, @RequestParam Long planId);

}
