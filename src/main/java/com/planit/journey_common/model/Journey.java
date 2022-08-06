package com.planit.journey_common.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder(toBuilder=true)
@AllArgsConstructor
@NoArgsConstructor
public class Journey {
	
	private Point sourcePoint;
	private Point destinationPoint;
	private Long startTimeInMillies;
	private Long durationInMillies;
	private Long waitingTimeInMillies;
	private Long startBufferTimeInMillies;
	private Long endBufferTimeInMillies;
	private Double travellingCost;
	private Double reachingWeight;
	private Double journeyWeight;
	private Medium travellingMedium;
	
	public RoutePointBean buildRoutePoint() {
		System.out.println("Converting Journey: "+ this+" to routePointBean !!");
		return new RoutePointBean(destinationPoint, reachingWeight+journeyWeight);
	};
	
}
