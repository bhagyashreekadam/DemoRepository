package com.mapitz.gwt.googleMaps.client;

class GProjectionImpl
{	
//  fromLatLngToPixel(latlng, zoom) GPoint  Returns the map coordinates in pixels for the point at the given geographical coordinates, and the given zoom level. 
	public native GPoint fromLatLngToPixel(GProjection self, GLatLng latlng, int zoom)/*-{
		return self.fromLatLngToPixel(latlng, zoom);
	}-*/;
	
//	fromPixelToLatLng(pixel, zoom, unbounded) none  Returns the geographical coordinates for the point at the given map coordinates in pixels, and the given zoom level. Flag unbounded causes the geographical longitude coordinate not to wrap when beyond the -180 or 180 degrees meridian. 
	public native GLatLng fromPixelToLatLng(GProjection self, GPoint pixel, int zoom, boolean unbounded)/*-{
		return self.fromPixelToLatLng(pixel, zoom, unbounded);
	}-*/;

//	fromPixelToLatLng(pixel, zoom, unbounded) none  Returns the geographical coordinates for the point at the given map coordinates in pixels, and the given zoom level. Flag unbounded causes the geographical longitude coordinate not to wrap when beyond the -180 or 180 degrees meridian. 
	public native GLatLng fromPixelToLatLng(GProjection self, GPoint pixel, int zoom)/*-{
		return self.fromPixelToLatLng(pixel, zoom);
	}-*/;
	
//	tileCheckRange(tile, zoom, tilesize) none  Returns to the map if the tile index is in a valid range for the map type. Otherwise the map will display an empty tile. It also may modify the tile index to point to another instance of the same tile in the case that the map contains more than one copy of the earth, and hence the same tile at different tile coordinates.
	public native void tileCheckRange(GProjection self, GPoint title, int zoom, int tilesize)/*-{
		return self.tileCheckRange(tile, zoom, tilesize);
	}-*/;
	
//	getWrapWidth(zoom) none  Returns to the map the periodicity in x-direction, i.e. the number of pixels after which the map repeats itself because it wrapped once round the earth. By default, returns Infinity, i.e. the map will not repeat itself. This is used by the map to compute the placement of overlays on map views that contain more than one copy of the earth (this usually happens only at low zoom levels). (Since 2.46) 
	public native void getWrapWidth(GProjection self, int zoom)/*-{
		return self.getWrapWidth(zoom);
	}-*/;
}
