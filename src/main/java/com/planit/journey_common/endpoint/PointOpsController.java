package com.planit.journey_common.endpoint;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planit.journey_common.model.Point;

public interface PointOpsController {
	
	@GetMapping("/getPointsByStringMatch/{matchString}")
	List<Point> getPointsByStringMatch(@PathVariable String matchString);
	
	@PostMapping("/getPointInfo")
	Point getPointInfo(@RequestBody Point point);
	
	@GetMapping("/getPointByName/{name}")
	Point getPointByName(@PathVariable String name);

}
