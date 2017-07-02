package com.java.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You can use Collections.sort() method with reverse Comparator, which can sort elements in 
 * the reverse order of their natural order 
 * 
 * @author 016VikasWorld
 *
 */
public class SortList {

	public static void main(String args[]){

		List<String> listOfString = Arrays.asList("London", "Tokyo", "NewYork");
		Collections.sort(listOfString, Collections.reverseOrder());
		System.out.println(listOfString); //[Tokyo, NewYork, London]

	}
	
}
