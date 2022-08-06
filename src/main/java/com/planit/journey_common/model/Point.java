package com.planit.journey_common.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Point {
	private Double lang;
	private Double longi;
	private String name;
	private Campus campus;
	
	@Override
	public int hashCode() {
		return campus != null ? Objects.hashCode(campus) : Objects.hash(lang,longi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (campus == null) {
			if (other.campus != null)
				return false;
		} else if (!campus.equals(other.campus))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (longi == null) {
			if (other.longi != null)
				return false;
		} else if (!longi.equals(other.longi))
			return false;
		return true;
	}
	
	
}
