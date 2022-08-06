package com.planit.journey_common.model;

import java.util.ArrayList;
import java.util.List;

import com.planit.journey_common.model.Journey;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Plan {
	private final List<Journey> journies = new ArrayList<>();
	private Double weight;
}
