package com.planit.journey_common.endpoint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planit.journey_common.endpoint.common.AbstractEndpointInterface;
import com.planit.journey_common.model.RoutePointBean;

public interface HeuristicController extends AbstractEndpointInterface {

	@PostMapping("/heuristify")
	RoutePointBean heuristify(@RequestBody RoutePointBean routePointBean, @RequestParam Long planId);
}
