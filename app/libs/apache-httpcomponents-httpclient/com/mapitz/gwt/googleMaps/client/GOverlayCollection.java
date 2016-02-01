package com.mapitz.gwt.googleMaps.client;

import java.util.Vector;


public class GOverlayCollection
{
	Vector dex = new Vector();
	GOverlay[] cache;
	
	public void add(GOverlay overlay)
	{
		cache = null;
		dex.add(overlay);
	}
	
	public GOverlay get(int i)
	{
		return (GOverlay)dex.get(i);
	}
	
	public int size()
	{
		return dex.size();
	}
	
	public void clear()
	{
		this.dex.clear();
	}
	
	public GOverlay[] asArray()
	{
		if (cache != null) return cache;
		
		int size = size();
		GOverlay[] rtn = new GOverlay[size];
		
		for(int i = 0; i < size; i++)
		{
			rtn[i] = get(i);
		}
		
		cache = rtn;
		
		return rtn;
		
	}

}
