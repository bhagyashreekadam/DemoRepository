package com.mapitz.gwt.googleMaps.client;

class GOverlayImpl 
{
//	initialize(map) none  Called by the map after the overlay is added to the map using GMap2.addOverlay(). The overlay object can draw itself into the different panes of the map that can be obtained using GMap2.getPane(). 
//	remove() none  Called by the map after the overlay is removed from the map using GMap2.removeOverlay() or GMap2.clearOverlays(). The overlay must remove itself from the map panes here. 
//	copy() GOverlay  Returns an uninitialized copy of itself that can be added to the map. 
//	redraw(force) none  Called by the map when the map display has changed. The argument force will be true if the zoom level or the pixel offset of the map view has changed, so that the pixel coordinates need to be recomputed.

//Returns a CSS z-index value for a given latitude. It computes a z index such that overlays further south are on top of overlays further north, thus creating the 3D appearance of marker overlays
	public static native double GetZIndex(double latitude)/*-{
		return $wnd.GOverlay.getZIndex(latitude)
	}-*/;
	
//	initialize(map) none  Called by the map after the overlay is added to the map using GMap2.addOverlay(). The overlay object can draw itself into the different panes of the map that can be obtained using GMap2.getPane(). 
	public native void Initialize(GOverlay self, GMap2 map)/*-{
		self.initialize(map);
	}-*/;

//	remove() none  Called by the map after the overlay is removed from the map using GMap2.removeOverlay() or GMap2.clearOverlays(). The overlay must remove itself from the map panes here.
	public native void Remove(GOverlay self)/*-{
		self.remove();
	}-*/;

//	copy() GOverlay  Returns an uninitialized copy of itself that can be added to the map.	
	public native GOverlay Copy(GOverlay self)/*-{
		self.copy();
	}-*/;	

//	redraw(force) none  Called by the map when the map display has changed. The argument force will be true if the zoom level or the pixel offset of the map view has changed, so that the pixel coordinates need to be recomputed.	
	public native void Redraw(GOverlay self, boolean force)/*-{
		self.redraw(force);
	}-*/;	
}
