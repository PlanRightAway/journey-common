package com.planit.journey_common.model;

import lombok.Data;

@Data
public class PlanCriteria {
	
	private Point sourcePoint;
	private Point destinationPoint;
	
	private Long startTimeInMillis;
	
	private Integer timeWeightage;
	private Integer costWeightage;
	private Integer convienceWeightage;

}
