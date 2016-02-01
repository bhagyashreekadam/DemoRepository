package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class GInfoWindowTabImpl
{
	public static native GInfoWindowTab create(String label, Element content)/*-{
		return new $wnd.GInfoWindowTab(label, content);
	}-*/;
	
	public static native GInfoWindowTab create(String label, String content)/*-{
		return new $wnd.GInfoWindowTab(label, content);
	}-*/;
}
