package com.mapitz.gwt.googleMaps.client;

class GPointImpl
{
	public static native GPoint CreateGPoint(int x, int y)/*-{
		return new $wnd.GPoint(x, y);
	}-*/;
	
	public native boolean Equals(GPoint self, GPoint other)/*-{
    	return self.equals(other);
    }-*/;
	
	public native String ToString(GPoint self)/*-{
		return self.toString();
	}-*/;
}
