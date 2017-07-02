package com.java.collection.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingMap {

	public static void main(String[] args){
		
		 HashMap<String, String> loans = new HashMap<String, String>();
		 loans.put("home loan", "citibank");
		 loans.put("personal loan", "Wells Fargo");

		 for (String key : loans.keySet()) {
		    System.out.println("------------------------------------------------");
		    System.out.println("Iterating or looping map using java5 foreach loop");
		    System.out.println("key: " + key + " value: " + loans.get(key));
		 }

		/* Output:
		 ------------------------------------------------
		 Iterating or looping map using java5 foreach loop
		 key: home loan value: Citibank
		 ------------------------------------------------
		 Iterating or looping map using java5 foreach loop
		 key: personal loan value: Wells Fargo

		 Read more: http://javarevisited.blogspot.com/2011/12/how-to-traverse-or-loop-hashmap-in-java.html#ixzz4lggC3CbJ
*/
		 Set<String> keySet = loans.keySet();
		 Iterator<String> keySetIterator = keySet.iterator();
		 while (keySetIterator.hasNext()) {
		    System.out.println("------------------------------------------------");
		    System.out.println("Iterating Map in Java using KeySet Iterator");
		    String key = keySetIterator.next();
		    System.out.println("key: " + key + " value: " + loans.get(key));
		 }
/*
		 Output:
		 ------------------------------------------------
		 Iterating Map in Java using KeySet Iterator
		 key: home loan value: Citibank
		 ------------------------------------------------
		 Iterating Map in Java using KeySet Iterator
		 key: personal loan value: Wells Fargo

		 Read more: http://javarevisited.blogspot.com/2011/12/how-to-traverse-or-loop-hashmap-in-java.html#ixzz4lggeZ7Db
*/
		 Set<Map.Entry<String, String>> entrySet = loans.entrySet();
		 for (Entry entry : entrySet) {
		    System.out.println("------------------------------------------------");
		    System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
		    System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		 }

/*		 Output:
		 ------------------------------------------------
		 looping HashMap in Java using EntrySet and java5 for loop
		 key: home loan value: Citibank
		 ------------------------------------------------
		 looping HashMap in Java using EntrySet and java5 for loop
		 key: personal loan value: Wells Fargo

		 Read more: http://javarevisited.blogspot.com/2011/12/how-to-traverse-or-loop-hashmap-in-java.html#ixzz4lggrafge
*/
		 

Set<Map.Entry<String, String>> entrySet1 = loans.entrySet();
Iterator<Entry<String, String>> entrySetIterator = entrySet1.iterator();
while (entrySetIterator.hasNext()) {
   System.out.println("------------------------------------------------");
   System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
   Entry entry = entrySetIterator.next();
   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
}

/*Output:
------------------------------------------------
Iterating HashMap in Java using EntrySet and Java iterator
key: home loan value: Citibank
------------------------------------------------
Iterating HashMap in Java using EntrySet and Java iterator
key: personal loan value: Wells Fargo

Read more: http://javarevisited.blogspot.com/2011/12/how-to-traverse-or-loop-hashmap-in-java.html#ixzz4lgh2yGoY
*/
	}
}
