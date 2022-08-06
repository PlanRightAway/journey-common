package com.planit.journey_common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Medium {
	
	private String muid;
	private String type;
	private String seatType;
	

}
