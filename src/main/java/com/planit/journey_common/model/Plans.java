package com.planit.journey_common.model;

import java.util.Set;
import java.util.TreeSet;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Plans {
	private final Set<Plan> plans = new TreeSet<>();
	private Double maxWeight = Double.MAX_VALUE;
	private Long size = 0L;
	
	public void addPlan(Plan plan) {
		plans.add(plan);
		size++;
	}
}
