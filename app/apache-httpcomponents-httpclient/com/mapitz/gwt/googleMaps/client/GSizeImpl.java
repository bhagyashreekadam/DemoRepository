package com.mapitz.gwt.googleMaps.client;

class GSizeImpl {

	public static native GSize create(int width, int height)/*-{
	    return new $wnd.GSize(width, height);
	}-*/;
	
	public native boolean equals(GSize self, GSize other)/*-{
    	return self.equals(other);
    }-*/;
}
