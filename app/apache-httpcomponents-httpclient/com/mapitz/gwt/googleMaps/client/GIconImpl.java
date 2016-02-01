package com.mapitz.gwt.googleMaps.client;

class GIconImpl
{
	/*
	 * Creates a control with buttons to pan in four directions, and zoom in and zoom out, and a zoom slider.
	 */
	public static native GIcon create(GIcon other)/*-{
		return new $wnd.GIcon(other);
	}-*/;
		
	public static native GIcon create(GIcon other, String url)/*-{
		return new $wnd.GIcon(other, url);
	}-*/;

	public static native GIcon create()/*-{
		return new $wnd.GIcon();
	}-*/;
	
	public static native GIcon G_DEFAULT_ICON()/*-{
		return $wnd.G_DEFAULT_ICON;
	}-*/;
	
	public native GSize getIconSize(GIcon self) /*-{
	    var ret = self.iconSize;
	    return (ret === undefined) ? null : ret;
    }-*/;
	
	public native GSize getShadowSize(GIcon self) /*-{
	    var ret = self.shadowSize;
	    return (ret === undefined) ? null : ret;
    }-*/;
	
	public native GPoint getIconAnchor(GIcon self) /*-{
    	var ret = self.iconAnchor;
    	return (ret === undefined) ? null : ret;
    }-*/;
	
	public native GPoint getInfoWindowAnchor(GIcon self) /*-{
		var ret = self.infoWindowAnchor;
		return (ret === undefined) ? null : ret;
    }-*/;
}
