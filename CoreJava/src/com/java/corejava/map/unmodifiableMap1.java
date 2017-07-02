package com.java.corejava.map;

	import java.util.*;

	public class unmodifiableMap1 {
	   public static void main(String[] s) {
	   //object hash table 
	   Hashtable<String,String> table = new Hashtable<String,String>();
	      
	   // populate the table
	   table.put("key1", "value1");
	   table.put("key2", "value2");
	   table.put("key3", "value3");
	      
	   System.out.println("Initial collection: "+table);
	      
	   // create unmodifiable map
	   Map m = Collections.unmodifiableMap(table);

	   // try to modify the collection
	   m.put("key3", "value3");
	   }
	}
	
/*
	Initial collection: {key3=value3, key2=value2, key1=value1}
	Exception in thread "main" java.lang.UnsupportedOperationException
*/