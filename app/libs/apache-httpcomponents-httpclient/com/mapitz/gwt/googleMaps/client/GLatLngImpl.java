package com.mapitz.gwt.googleMaps.client;

class GLatLngImpl {

	public static native GLatLng CreateLatLngObject(double lat, double lng)/*-{
	    return new $wnd.GLatLng(lat, lng);
	}-*/;

	public static native GLatLng CreateLatLngObject(double lat, double lng, boolean unbounded)/*-{
    	return new $wnd.GLatLng(lat, lng, unbounded);
    }-*/;
	
	public static native double distanceFrom(GLatLng latlng, GLatLng other)/*-{
	  	return latlng.distanceFrom(other);
	  }-*/;

	public static native boolean equals(GLatLng latlng, GLatLng other)/*-{
	  	return latlng.equals(other);
	  }-*/;

	public static native double Lat(GLatLng latlng)/*-{
	  	return latlng.lat();
	  }-*/;

	public static native double LatRadians(GLatLng latlng)/*-{
	  	return latlng.latRadians();
	  }-*/;

	public static native double Lng(GLatLng latlng)/*-{
	  	return latlng.lng();
	  }-*/;

	public static native double LngRadians(GLatLng latlng)/*-{
	  	return latlng.lngRadians();
	  }-*/;

	public static native String toUrlValue(GLatLng latlng)/*-{
	  	return latlng.toUrlValue();
	  }-*/;

}
