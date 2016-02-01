package com.mapitz.gwt.googleMaps.client;

class GCopyrightCollectionImpl
{
	/*
	 * 	GCopyrightCollection(prefix) Copyright messages produced from this copyright collection will have the common prefix given as the argument. Example: "Imagery (C) 2006"
	 */
	public static native GCopyrightCollection create(String prefix)/*-{
		return new $wnd.GCopyrightCollection(prefix);
	}-*/;

	/*
	 * 	GCopyrightCollection() Copyright messages produced from this copyright collection will have the common prefix given as the argument. Example: "Imagery (C) 2006"
	 */
	public static native GCopyrightCollection create()/*-{
		return new $wnd.GCopyrightCollection();
    }-*/;

	/*
	 * 	addCopyright(copyright) none  Adds a copyright information object to the collection.
	 */
	public native void addCopyright(GCopyrightCollection self, GCopyright copyright)/*-{
		self.addCopyright(copyright);
	}-*/;

	/*
	 * 	getCopyrights(bounds, zoom) Array of String  Returns all copyright strings that are pertinent for the given map region at the given zoom level. Example: [ "Google", "Keyhole" ]
	 */
	public native String[] getCopyrights(GCopyrightCollection self, GLatLngBounds bounds, int zoom)/*-{
		self.getCopyrights(bounds, zoom);
	}-*/;	 
  
	/*
	 * 	getCopyrightNotice(bounds, zoom) String  Returns the prefix and all relevant copyright strings that are pertinent for the given map region at the given zoom level. Example: "Imagery (C) 2006 Google, Keyhole"
	 */
	public native String getCopyrightNotice(GCopyrightCollection self, GLatLngBounds bounds, int zoom)/*-{
		self.getCopyrightNotice(bounds, zoom);
	}-*/;
}
