package com.java.corejava.map;

	import java.util.Collections;
	import java.util.HashMap;
	import java.util.Map;
	/*www. ja  va 2s  .  c o  m*/
	public class UnmodifiableMap {

	  public static void main(String[] args) {
	    Map<String, String> map = getMap();
	    map.put("a", "b");
	  }

	  public static final Map<String, String> getMap() {
	    Map<String, String> map = new HashMap<String, String>();
	    map.put("x", "y");
	    return Collections.unmodifiableMap(map);
	  }
	}