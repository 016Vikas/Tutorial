package com.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class EmptyArrayList {

	public static void main(String args[]){
		
		ArrayList<Integer> alist = new ArrayList<Integer>(5);
		
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		
		for(Integer i : alist)
			System.out.println(i);
		
		Iterator<Integer> itr = alist.iterator(); 
		 while(itr.hasNext())
			 System.out.println(itr.next());
			 
		System.out.println(alist.size());
			alist.clear();
		System.out.println(alist.size());
		
		for(Integer i : alist)
			System.out.println(i);
		
		Iterator<Integer> itr1 = alist.iterator(); 
		 while(itr.hasNext())
			 System.out.println(itr.next());
		 
	}
}
