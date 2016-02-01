package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

class GMap2Impl {

	public native GMap2 createMapObject(Element div)/*-{
	    return new $wnd.GMap2(div);
	}-*/;
	
	public native void enableAutomatedCheckResizeOnMoveEnd(GMap2 map)/*-{		
	    $wnd.GEvent.addListener(map, "moveend", 
			function()
			{
			   map.checkResize();
			}
		);
	}-*/;

	public native void enableCheckResizeOnLoad(GMap2 map)/*-{		
    $wnd.GEvent.addListener(map, "load", 
		function()
		{
		   map.checkResize();
		}
	);
	}-*/;
	
	public native void disableDragging(GMap2 map)/*-{
	  	map.disableDragging();
	  }-*/;

	public native void disableInfoWindow(GMap2 map)/*-{
	  	map.disableInfoWindow();
	  }-*/;

	public native boolean draggingEnabled(GMap2 map)/*-{
	  return map.draggingEnabled();
	  }-*/;

	public native void enableDragging(GMap2 map)/*-{
	  	map.enableDragging();
	  }-*/;

	public native void enableInfoWindow(GMap2 map)/*-{
	  	map.enableInfoWindow();
	  }-*/;

	public native boolean GBrowserIsCompatible()/*-{
		  return $wnd.GBrowserIsCompatible();
	  }-*/;

	public native GLatLngBounds getBounds(GMap2 map)/*-{
	  return map.getBounds() ? map.getBounds() : null;
	  }-*/;

	public native int getBoundsZoomLevel(GMap2 map, GLatLngBounds bounds)/*-{
	  return map.getBoundsZoomLevel(bounds);
	  }-*/;

	public native GLatLng getCenter(GMap2 map)/*-{
	  return map.getCenter();
	  }-*/;

    public native GSize getSize(GMap2 map)/*-{
	  return map.getSize();
	  }-*/;

	public native double getZoom(GMap2 map)/*-{
	  return map.getZoom();
	  }-*/;

	public native boolean infoWindowEnabled(GMap2 map)/*-{
	  return map.infoWindowEnabled();
	  }-*/;

//	enableDoubleClickZoom()  	 none   	Enables double click to zoom in and out (disabled by default). (Since 2.58)
	public native void enableDoubleClickZoom(GMap2 map)/*-{
	  	map.enableDoubleClickZoom();
	  }-*/;
	
//	disableDoubleClickZoom() 	none 	Disables double click to zoom in and out. (Since 2.58)	
	public native void disableDoubleClickZoom(GMap2 map)/*-{
	  	map.disableDoubleClickZoom();
	  }-*/;
	
//	doubleClickZoomEnabled() 	Boolean 	Returns true iff double click to zoom is enabled. (Since 2.58)	
	public native boolean doubleClickZoomEnabled(GMap2 map)/*-{
	  return map.doubleClickZoomEnabled();
	  }-*/;

//	enableContinuousZoom() 	none 	Enables continuous smooth zooming for select browsers (disabled by default). (Since 2.58)
	public native void enableContinuousZoom(GMap2 map)/*-{
	  	map.enableContinuousZoom();
	  }-*/;

//	disableContinuousZoom() 	none 	Disables continuous smooth zooming. (Since 2.58)
	public native void disableContinuousZoom(GMap2 map)/*-{
	  	map.disableContinuousZoom();
	  }-*/;
	
//	continuousZoomEnabled() 	Boolean 	Returns true iff continuous smooth zooming is enabled. (Since 2.58)
	public native boolean continuousZoomEnabled(GMap2 map)/*-{
	  return map.continuousZoomEnabled();
	  }-*/;
	
	
	public native boolean isLoaded(GMap2 map)/*-{
	  return map.isLoaded();
	  }-*/;

//	setCenter(center, zoom?, type?) none  Sets the map view to the given center. Optionally, also sets zoom level and map type. The map type must be known to the map. See the constructor, and the method addMapType(). This method must be called first after construction to set the initial state of the map. It is an error to call other operations on the map after construction. 

	public native void setCenter(GMap2 map, GLatLng latlng, int zoomlevel, GMapType type)/*-{
    	map.setCenter(latlng, zoomlevel, type);
    }-*/;

	public native void setCenter(GMap2 map, GLatLng latlng, int zoomlevel)/*-{
		map.setCenter(latlng, zoomlevel);
	}-*/;
	
	public native void setCenter(GMap2 map, GLatLng latlng)/*-{
		map.setCenter(latlng);
	}-*/;
	
//	panTo(center) none  Changes the center point of the map to the given point. If the point is already visible in the current map view, change the center in a smooth animation. 	
	public native void panTo(GMap2 map, GLatLng center)/*-{
    	map.panTo(center);
    }-*/;

//	setZoom(level) none  Sets the zoom level to the given new value.
	public native void setZoom(GMap2 map, int level)/*-{
		map.setZoom(level);
    }-*/; 
 
//	panBy(distance) none  Starts a pan animation by the given distance in pixels.
	public native void panBy(GMap2 map, int distance)/*-{
		map.panBy(distance);
	}-*/;

//	panDirection(dx, dy) none  Starts a pan animation by half the width of the map in the indicated directions. +1 is right and down, -1 is left and up, respectively.	
	public native void panDirection(GMap2 map, int dx, int dy)/*-{
		map.panDirection(dx, dy);
	}-*/;	
	
	
//	zoomIn() none  Increments zoom level by one.
	public native void zoomIn(GMap2 map)/*-{
		map.zoomIn();
	}-*/;
	
//	zoomOut() none  Decrements zoom level by one. 
	public native void zoomOut(GMap2 map)/*-{
		map.zoomOut();
	}-*/;
	
//	savePosition() none  Stores the current map position and zoom level for later recall by returnToSavedPosition().
	public native void savePosition(GMap2 map)/*-{
		map.savePosition();
	}-*/;
	
//	returnToSavedPosition() none  Restores the map view that was saved by savePosition().
	public native void returnToSavedPosition(GMap2 map)/*-{
		map.returnToSavedPosition();
	}-*/;
	
//	checkResize() none  Notifies the map of a change of the size of its container. Call this method after the size of the container DOM object has changed, so that the map can adjust itself to fit the new size. 
	public native void checkResize(GMap2 map)/*-{
	map.checkResize();
	}-*/;
	
	/*
	 * addControl(control, position?) none  Adds the control to the map. The position on the map is determined by the optional position argument. If this argument is absent, the default position of the control is used, as determined by the GControl.getDefaultPosition() method. A control instance must not be added more than once to the map.
	 */
	public native void addControl(GMap2 map, GControl control, GControlPosition position)/*-{
		map.addControl(control, position);
	}-*/;

	/*
	 * addControl(control, position?) none  Adds the control to the map. The position on the map is determined by the optional position argument. If this argument is absent, the default position of the control is used, as determined by the GControl.getDefaultPosition() method. A control instance must not be added more than once to the map.
	 */
	public native void addControl(GMap2 map, GControl control)/*-{
		map.addControl(control);
	}-*/;
	
	/*
	 * removeControl(control) none  Removes the control from the map. It does nothing if the control was never added to the map.
	 */
	public native void removeControl(GMap2 map, GControl control)/*-{
		map.removeControl(control);
	}-*/;
	
	/*
	 * getContainer() Node  Returns the DOM object that contains the map. Used by GControl.initialize().
	 */
	public native Element getContainer(GMap2 map)/*-{
		return map.getContainer();
	}-*/;
	
	/*
	 * getMapTypes() Array of GMapType  Returns the array of map types registered with this map.
	 */
	public native JavaScriptObject getMapTypes(GMap2 map)/*-{
	    var ret = map.getMapTypes();
	    return (ret === undefined) ? null : ret;
	}-*/;
	
	public native int getMapTypesArraySize(JavaScriptObject mapTypeArray)/*-{
		if (mapTypeArray) return mapTypeArray.length;
		return -1;
	}-*/;
	
	public native GMapType getMapTypesValueAtPosition(JavaScriptObject mapTypeArray, int pos)/*-{
		if (mapTypeArray) return mapTypeArray[pos];
		return null;
	}-*/;
	
	/*
	 * getCurrentMapType() GMapType  Returns the currently selected map type.
	 */
	public native GMapType getCurrentMapType(GMap2 map)/*-{
		return map.getCurrentMapType();
	}-*/;
	
	/*
	 * setMapType(type) none  Selects the given new map type. The type must be known to the map. See the constructor, and the method addMapType().
	 */ 
	public native void setMapType(GMap2 map, GMapType type)/*-{
		map.setMapType(type);
	}-*/;

	/*
	 * addMapType(type) none  Adds a new map type to the map. See section GMapType for how to define custom map types.
	 */
	public native void addMapType(GMap2 map, GMapType type)/*-{
		map.addMapType(type);
	}-*/;
	
	/*
	 * removeMapType(type) none  Removes the map type from the map. Will update the set of buttons displayed by the GMapTypeControl and fire the removemaptype event.
	 */ 
	public native void removeMapType(GMap2 map, GMapType type)/*-{
		map.removeMapType(type);
	}-*/;	
	
	/*
	 * addOverlay(overlay) none  Adds an overlay to the map and fires the addoverlay event.
	 */
	public native void addOverlay(GMap2 map, GOverlay overlay)/*-{
		map.addOverlay(overlay);
	}-*/;
	
	/*
	 * removeOverlay(overlay) none  Removes the overlay from the map. If the overlay was on the map, it fires the removeoverlay event.
	 */
	public native void removeOverlay(GMap2 map, GOverlay overlay)/*-{
		map.removeOverlay(overlay);
	}-*/;
	
	/*
	 * clearOverlays() none  Removes all overlay from the map, and fires the clearoverlays event.
	 */
	public native void clearOverlays(GMap2 map)/*-{
		map.clearOverlays();
	}-*/;
	
	/*
	 * getPane(pane) Node  Returns a DIV that holds the object in the layer identified by pane. Used by GOverlay instances in method GOverlay.initialize() instances to draw themselves on the map
	 */ 
	public native Element getPane(GMap2 map, int pane)/*-{
		return map.getPane(pane);
	}-*/;
	
	//TODO Add
	
	/*
	 * openInfoWindow(point, node, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as a DOM node.
	 */
	public native void openInfoWindow(GMap2 map, GLatLng point, Element node, GInfoWindowOptions opts)/*-{
		map.openInfoWindow(point, node, opts);
	}-*/;

	/*
	 * openInfoWindow(point, node, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as a DOM node.
	 */
	public native void openInfoWindow(GMap2 map, GLatLng point, Element node)/*-{
		map.openInfoWindow(point, node);
	}-*/;
	
	/*
	 * openInfoWindowHtml(point, html, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public native void openInfoWindowHtml(GMap2 map, GLatLng point, String html, GInfoWindowOptions opts)/*-{
		map.openInfoWindowHtml(point, html, opts);
	}-*/;

	/*
	 * openInfoWindowHtml(point, html, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public native void openInfoWindowHtml(GMap2 map, GLatLng point, String html)/*-{
		map.openInfoWindowHtml(point, html);
	}-*/;
	
	/*
	 * openInfoWindowTabs(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as DOM nodes.
	 */
	public native void openInfoWindowTabs(GMap2 map, GLatLng point, JavaScriptObject tabs, GInfoWindowOptions opts)/*-{
		map.openInfoWindowTabs(point, tabs, opts);
	}-*/;
	
	/*
	 * openInfoWindowTabs(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as DOM nodes.
	 */
	public native void openInfoWindowTabs(GMap2 map, GLatLng point, JavaScriptObject tabs)/*-{
		map.openInfoWindowTabs(point, tabs);
	}-*/;
	
	/*
	 * openInfoWindowTabsHtml(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public native void openInfoWindowTabsHtml(GMap2 map, GLatLng point, JavaScriptObject tabs, GInfoWindowOptions opts)/*-{
		map.openInfoWindowTabsHtml(point, tabs, opts);
	}-*/;
	
	/*
	 * openInfoWindowTabsHtml(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public native void openInfoWindowTabsHtml(GMap2 map, GLatLng point, JavaScriptObject tabs)/*-{
		map.openInfoWindowTabsHtml(point, tabs);
	}-*/;	
	
	/*
	 * showMapBlowup(point, opts?) none  Opens an info window at the given point that contains a closeup view on the map around this point.
	 */
	public native void showMapBlowup(GMap2 map, GLatLng point, GInfoWindowOptions opts)/*-{
		map.showMapBlowup(point, opts);
	}-*/;

	/*
	 * showMapBlowup(point, opts?) none  Opens an info window at the given point that contains a closeup view on the map around this point.
	 */
	public native void showMapBlowup(GMap2 map, GLatLng point)/*-{
		map.showMapBlowup(point);
	}-*/;
	
	/*
	 * closeInfoWindow() none  Closes the currently open info window.
	 */
	public native void closeInfoWindow(GMap2 map)/*-{
		map.closeInfoWindow();
	}-*/;	
	
	/*
	 * getInfoWindow() GInfoWindow  Returns the info window object of this map. If no info window exists yet, it is created, but not displayed. This operation is not influenced by enableInfoWindow().
	 */
	public native GInfoWindow getInfoWindow(GMap2 map)/*-{
		return map.getInfoWindow();
	}-*/;	

	/*
	 * fromLatLngToDivPixel(latlng)  	  GPoint    	Computes the pixel coordinates of the given geographical point in the DOM element that holds the draggable map. You need this method to position a custom overlay when you implement the GOverlay.redraw() method for a custom overlay.
	 */
	public native GPoint fromLatLngToDivPixel(GMap2 map, GLatLng latlng)/*-{
		return map.fromLatLngToDivPixel(latlng);
	}-*/;
	
	/*
	 * fromDivPixelToLatLng(pixel) 	GLatLng 	Computes the geographical coordinates from pixel coordinates in the div that holds the draggable map. You need this when you implement interaction with custom overlays.
	 */
	public native GLatLng fromDivPixelToLatLng(GMap2 map, GPoint pixel)/*-{
		return map.fromDivPixelToLatLng(pixel);
	}-*/;
	
	/*
	 * fromContainerPixelToLatLng(pixel) 	GLatLng 	Computes the geographical coordinates of the point at the given pixel coordinates in the DOM element that contains the map on the page. You need this when you implement interaction of custom controls with the map.
	 */
	public native GLatLng fromContainerPixelToLatLng(GMap2 map, GPoint pixel)/*-{
		return map.fromContainerPixelToLatLng(pixel);
	}-*/;
	
    public native void test1(GMap2 map)/*-{ 

	    var bounds = map.getBounds(); 
	    var southWest = bounds.getSouthWest(); 
	    var northEast = bounds.getNorthEast(); 
	    var lngSpan = northEast.lng() - southWest.lng(); 
	    var latSpan = northEast.lat() - southWest.lat(); 
	    for (var i = 0; i < 30; i++) { 
	      var point = new $wnd.GLatLng(southWest.lat() + latSpan *	Math.random(), 
	                              southWest.lng() + lngSpan * Math.random()); 
	      map.addOverlay(new $wnd.GMarker(point)); 
	    }; 
	
	
	    // Add a polyline with five random points. Sort the points by 
	    // longitude so that the line does not intersect itself. 
	    var points = new Array(); 
	    for (var i = 0; i < 5; i++) { 
	      points[i] = new $wnd.GLatLng(southWest.lat() + latSpan *	Math.random(), 
	                                   southWest.lng() + lngSpan * 	Math.random()); 
	    } 
	    points.sort(function(p1, p2) { 
	      return p1.lng() - p2.lng(); 
	    }); 
	
	    var polyline =  new $wnd.GPolyline(points);
	    $wnd.alert(polyline.getVertexCount() + " = Vertex Count");
	    map.addOverlay(polyline); 
	}-*/;
	
}
