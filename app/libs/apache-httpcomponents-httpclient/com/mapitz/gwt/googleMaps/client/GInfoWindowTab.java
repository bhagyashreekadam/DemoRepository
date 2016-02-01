package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
/**
 * An array of instances of this class can be passed as the tabs argument to the methods GMap2.openInfoWindowTabs(), GMap2.openInfoWindowTabsHtml(), GMarker.openInfoWindowTabs(), and GMarker.openInfoWindowTabsHtml(). If the array contains more than one element, the info window will be shown with tabs. Every InfoWindowTab object contains two items: content defines the content of the info window when the tab is selected, and label defines the label of the tab. The properties are passed as arguments to the constructor. For the openInfoWindowTabs() methods, content is a DOM Node. For the methods openInfoWindowTabsHtml(), content is a string that contains HTML text.
 * @author aglaforge
 *
 */
public class GInfoWindowTab extends JavaScriptObject
{

	protected GInfoWindowTab(int opaque)
	{
		super(opaque);
	}

	public static GInfoWindowTab create (String label, String content)
	{
		return GInfoWindowTabImpl.create(label, content);
	}
	
	public static GInfoWindowTab create (String label, Element content)
	{
		return GInfoWindowTabImpl.create(label, content);
	}
}
