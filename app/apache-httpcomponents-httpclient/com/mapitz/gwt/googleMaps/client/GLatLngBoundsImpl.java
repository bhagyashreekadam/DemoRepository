package com.mapitz.gwt.googleMaps.client;

class GLatLngBoundsImpl {

	public static native GLatLngBounds CreateLatLngObject(GLatLng sw, GLatLng ne)/*-{
	return new $wnd.GLatLngBounds(sw, ne);
	}-*/;

	public static native GLatLngBounds CreateLatLngObject()/*-{
	return new $wnd.GLatLngBounds();
	}-*/;
	
	public native boolean Contains(GLatLngBounds self, GLatLng latlng)/*-{
	return self.contains(latlng);
	}-*/;

	public native boolean ContainsBounds(GLatLngBounds self, GLatLngBounds other)/*-{
	return self.containsBounds(other);
	}-*/;

	public native boolean Equals(GLatLngBounds self, GLatLngBounds other)/*-{
	return self.equals(other);
	}-*/;

	public native void Extend(GLatLngBounds self, GLatLng latlng)/*-{
	return self.extend(latlng);
	}-*/;

	public native GLatLng GetCenter(GLatLngBounds self)/*-{
	return self.getCenter();
	}-*/;

	public native GLatLng GetNorthEast(GLatLngBounds self)/*-{
	return self.getNorthEast();
	}-*/;

	//	equals(other) Boolean  Returns true iff all parameters in this rectangle are equal to the parameters of the other, within a certain roundoff margin. 
	//	contains(latlng) Boolean  Returns true iff the geographical coordinates of the point lie within this rectangle. 
	//	intersects(other) Boolean  What the name says. 
	//	containsBounds(other) Boolean  What the name says. 
	//	extend(latlng) none  Enlarges this rectangle such that it contains the given point. In longitude direction, it is enlarged in the smaller of the two possible ways. If both are equal, it is enlarged at the eastern boundary.
	
		public native GLatLng GetSouthWest(GLatLngBounds self)/*-{
	    return self.getSouthWest();
	    }-*/;

	public native boolean Intersects(GLatLngBounds self, GLatLngBounds other)/*-{
	return self.intersects(other);
	}-*/;

	public native boolean IsEmpty(GLatLngBounds self)/*-{
	return self.isEmpty();
	}-*/;

	public native boolean IsFullLat(GLatLngBounds self)/*-{
	return self.isFullLat();
	}-*/;

	public native boolean IsFullLng(GLatLngBounds self)/*-{
	return self.isFullLng();
	}-*/;

	public native GLatLng ToSpan(GLatLngBounds self)/*-{
	return self.toSpan();
	}-*/;

}
