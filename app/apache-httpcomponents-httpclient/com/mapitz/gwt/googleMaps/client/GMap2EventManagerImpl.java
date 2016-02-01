package com.mapitz.gwt.googleMaps.client;

class GMap2EventManagerImpl
{
	//	mouseover latlng  This event is fired when the user moves the mouse over the map from outside the map.
	public static native GEventListener addOnMouseOverListener(GMap2EventManager manager, GMap2 source)/*-{
	    return $wnd.GEvent.addListener(source, "mouseover", 
			function(latlng)
			{
				manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMouseOver(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GLatLng;)(source, latlng);
			}
		);
	}-*/;
	
	//moveend none  This event is fired when the change of the map view ends.
	public static native GEventListener addOnMoveEndListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "moveend", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMoveEnd(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;

	//movestart none  This event is fired when the map view starts changing. This can be caused by dragging, in which case a dragstart event is also fired, or by invocation of a method that changes the map view.
	public static native GEventListener addOnMoveStartListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "movestart", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMoveStart(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;

	//move none  This event is fired, possibly repeatedly, while the map view is changing. 
	public static native GEventListener addOnMoveListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "move", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMove(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;
	
//	addmaptype type  This event is fired when a map type is added to the map. 
	public static native GEventListener addOnAddMapTypeListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "addmaptype", 
			function(type)
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onAddMapType(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GMapType;)(source, type);
			}
		);
	}-*/;
//	removemaptype type  This event is fired when a map type is removed from the map. 
	public static native GEventListener addOnRemoveMapTypeListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "removemaptype", 
			function(type)
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onRemoveMapType(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GMapType;)(source, type);
			}
		);
	}-*/;
	
//	click overlay, point This event is fired when the map is clicked with the mouse. If the click was on a marker, then the marker is passed to the event handler in the overlay argument, and a click event is also fired on the marker. Otherwise, the geographical coordinates of the point that was clicked are passed in the point argument. 
	public static native GEventListener addOnClickListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "click", 
			function(overlay, point)
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onClick(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GOverlay;Lcom/mapitz/gwt/googleMaps/client/GLatLng;)(source, overlay, point);
			}
		);
	}-*/;
	
	
//	zoomend oldLevel, newLevel This event is fired when the map reaches a new zoom level. The event handler receives the previous and the new zoom level as arguments.
	public static native GEventListener addOnZoomEndListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "zoomend", 
			function(oldLevel, newLevel)
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onZoomEnd(Lcom/mapitz/gwt/googleMaps/client/GMap2;II)(source, oldLevel, newLevel);
			}
		);
	}-*/;
	
//	maptypechanged none  This event is fired when another map type is selected. 
	public static native GEventListener addOnMapTypeChangedListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "maptypechanged", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMapTypeChanged(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;	
	
//	infowindowopen none  This event is fired when the info window opens. 
	public static native GEventListener addOnInfoWindowOpenListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "infowindowopen", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onInfoWindowOpen(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;	
	
//	infowindowclose none  This event is fired when the info window closes. If a currently open info window is reopened at a different point using another call to openInfoWindow*(), then infowindowclose will fire first.
	public static native GEventListener addOnInfoWindowCloseListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "infowindowclose", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onInfoWindowClose(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;	
	
//	addoverlay overlay  This event is fired when a single overlay is added to the map by the method addOverlay(). The new overlay is passed as an argument overlay to the event handler. 
	public static native GEventListener addOnAddOverlayListener(GMap2EventManager manager, GMap2 source)/*-{
	    return $wnd.GEvent.addListener(source, "addoverlay", 
			function(overlay)
			{
				manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onAddOverlay(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GOverlay;)(source, overlay);
			}
		);
	}-*/;
	
//	removeoverlay overlay  This event is fired when a single overlay is removed by the method removeOverlay(). The overlay that was removed is passed as an argument overlay to the event handler. 
	public static native GEventListener addOnRemoveOverlayListener(GMap2EventManager manager, GMap2 source)/*-{
	    return $wnd.GEvent.addListener(source, "removeoverlay", 
			function(overlay)
			{
				manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onRemoveOverlay(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GOverlay;)(source, overlay);
			}
		);
	}-*/;
	
//	clearoverlays none  This event is fired when all overlays are removed at once by the method clearOverlays(). 
	public static native GEventListener addOnClearOverlaysListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "clearoverlays", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onClearOverlays(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/; 
	
//	mouseout latlng  This event is fired when the user moves the mouse off the map. 
	public static native GEventListener addOnMouseOutListener(GMap2EventManager manager, GMap2 source)/*-{
	    return $wnd.GEvent.addListener(source, "mouseout", 
			function(latlng)
			{
				manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMouseOut(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GLatLng;)(source, latlng);
			}
		);
	}-*/;
//	mousemove latlng  This event is fired when the user moves the mouse inside the map. 
	public static native GEventListener addOnMouseMoveListener(GMap2EventManager manager, GMap2 source)/*-{
	    return $wnd.GEvent.addListener(source, "mousemove", 
			function(latlng)
			{
				manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onMouseMove(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/GLatLng;)(source, latlng);
			}
		);
	}-*/;
	
//	dragstart none  This event is fired when the user starts dragging the map. 
	public static native GEventListener addOnDragStartListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "dragstart", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onDragStart(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;
	
//	drag none  This event is repeatedly fired while the user drags the map. 
	public static native GEventListener addOnDragListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "drag", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onDrag(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;
	
//	dragend none  This event is fired when the user stops dragging the map.
	public static native GEventListener addOnDragEndListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "dragend", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onDragEnd(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;
	
////	load none  This event is fired when the map setup is complete, and isLoaded() would return true. This means position, zoom, and map type are all initialized, but tile images may still be loading. (Since 2.52)
//	//TODO this works, but an exception gets thrown in the background
	public static native GEventListener addOnLoadListener(GMap2EventManager manager, GMap2 source)/*-{		
	    return $wnd.GEvent.addListener(source, "load", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMap2EventManager::onLoad(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(source);
			}
		);
	}-*/;

	public static native void removeListener(GEventListener event)/*-{		
    	$wnd.GEvent.removeListener(event);
	}-*/;
	
}
