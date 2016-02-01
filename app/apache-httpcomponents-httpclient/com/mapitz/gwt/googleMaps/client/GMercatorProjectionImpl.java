package com.mapitz.gwt.googleMaps.client;

class GMercatorProjectionImpl
{
	public static native GMercatorProjection create(int zoomlevels)/*-{
		return new $wnd.GMercatorProjection(zoomlevels);
	}-*/;
}
