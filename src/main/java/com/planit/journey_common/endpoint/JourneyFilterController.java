package com.planit.journey_common.endpoint;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planit.journey_common.endpoint.common.AbstractEndpointInterface;
import com.planit.journey_common.model.Journey;

public interface JourneyFilterController extends AbstractEndpointInterface {
	
	@PostMapping("/check")
	boolean check(@RequestBody Journey journey, @RequestParam Long planId);
		
	@PostMapping("/getSubFilters")
	List<String> getSubFilters(@RequestParam String value);

}
