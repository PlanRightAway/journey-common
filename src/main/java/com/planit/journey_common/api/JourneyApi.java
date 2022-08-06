package com.planit.journey_common.api;

import java.util.List;

import com.planit.journey_common.model.Journey;
import com.planit.journey_common.model.RoutePointBean;
import com.planit.journey_common.servicecommon.AbstractServiceInterface;

public interface JourneyApi extends AbstractServiceInterface {

	List<Journey> getJourneyRoutePoints(RoutePointBean routePointBean, Long planId);

}
