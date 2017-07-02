package com.java.corejava.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class unmodifiableMapPut {
	 public static final Map<String,Integer> MYHASH;
	    static{
	        Hashtable<String,Integer> tmp = 
	            new Hashtable<String,Integer>();
	        tmp.put("A",65);
	        tmp.put("C",67);
	        MYHASH = Collections.unmodifiableMap(tmp);
	    };
	    
	    private static final Hashtable<String,Integer> MYHASH1 = new Hashtable<String,Integer>() 
				{{     put("foo",      1);     
				       put("bar",      256);     
				       put("data",     3);     
				       put("moredata", 27);     
				       put("hello",    32);     
				       put("world",    65536);  }}; 
				       
	    public static void main(String[] s) {
	    	Map<String, String> realMap = new HashMap<String, String>();
	    	realMap.put("A", "B");
	    	
	

	Map<String, String> unmodifiableMap = Collections.unmodifiableMap(realMap);
	
	
	//As pointed out in a comment, an immutable map can also be created with the standard API using
	//This will create an unmodifiable view on a true copy of the given map, and thus nicely emulates the characteristics of the ImmutableMap without having to add the dependency 
	Map<String, String> immutableMap = 
		    Collections.unmodifiableMap(new LinkedHashMap<String, String>(realMap)); 

	// This is not possible: It would throw an 
	// UnsupportedOperationException
	//unmodifiableMap.put("C", "D");

	// This is still possible:
	realMap.put("E", "F");

	// The change in the "realMap" is now also visible
	// in the "unmodifiableMap". So the unmodifiableMap
	// has changed after it has been created.
	unmodifiableMap.get("E"); // Will return "F".
	
	System.out.println(MYHASH1.get("A"));

    //this will throw
    //java.lang.UnsupportedOperationException
    MYHASH1.put("B",66);    
	    }
}

/*
 * In contrast to that, the ImmutableMap of Guava is really immutable: It is a true copy of a given map, and 
 * nobody may modify this ImmutableMap in any way. 
 */

