package com.planit.journey_common.endpoint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planit.journey_common.endpoint.common.AbstractEndpointInterface;
import com.planit.journey_common.model.Journey;

public interface WeighingController extends AbstractEndpointInterface {

	@PostMapping("/getWeight")
	Double getWeight(@RequestBody Journey journey, @RequestParam Long planId);
	
}
