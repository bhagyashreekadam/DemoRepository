package com.mapitz.gwt.googleMaps.client;

class GTileLayerImpl
{ 
	/*
	 * GTileLayer(copyrights, minResolution, maxResolution) Constructor arguments can be omitted if instantiated as a prototype. A Subclass constructor must invoke this constructor using call().
	 */
	public static native GTileLayer create(GCopyrightCollection copyrights, int minResolution, int maxResolution)/*-{
		return new $wnd.GTileLayer(copyrights, minResolution, maxResolution);
	}-*/;

	/*
	 * minResolution() Number  Returns to the map type the lowest zoom level of this tile layer.
	 */
	public native int minResolution(GTileLayer self)/*-{
		return self.minResolution();
	}-*/;
	 
	/*
	 * maxResolution() Number  Returns to the map type the highest zoom level of this tile layer. 
	 */
	public native int maxResolution(GTileLayer self)/*-{
		return self.maxResolution();
	}-*/;
	
	/*
	 * getTileUrl(tile, zoom) String  Abstract. Returns to the map the URL of the map tile with the tile indices given by the x and y properties of the GPoint, at the given zoom level. 
	 */
	public native String getTileUrl(GTileLayer self, GPoint tile, int zoom)/*-{
		return self.getTileUrl(tile, zoom);
	}-*/;


	/*
	 * 	isPng() Boolean  Abstract. Returns to the map whether the tiles are in PNG image format and hence can be transparent. Otherwise GIF is assumed.
	 */
	public native boolean isPng(GTileLayer self)/*-{
		return self.isPng();
	}-*/;
	
	/*
	 * getOpacity() Number  Abstract. Returns to the map the opacity with which to display this tile layer. 1.0 is opaque, 0.0 is transparent.
	 */ 
	public native double getOpacity(GTileLayer self)/*-{
		return self.getOpacity();
	}-*/;
}
