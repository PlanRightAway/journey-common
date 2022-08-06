package com.planit.journey_common.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoutePointBean implements Comparable<RoutePointBean> {
	
	private Point point;
	private Double reachingWeight;
	
	private Double heuristicValue;
	
	public RoutePointBean(Point point, Double reachingWeight) {
		super();
		this.point = point;
		this.reachingWeight = reachingWeight;
	}

	public int compareTo(RoutePointBean o) {
		return this.heuristicValue.compareTo(o.heuristicValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoutePointBean other = (RoutePointBean) obj;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(point);
	}
	
	

}
