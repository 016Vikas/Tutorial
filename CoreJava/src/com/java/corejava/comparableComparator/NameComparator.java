package com.java.corejava.comparableComparator;

/*This class provides comparison logic based on the name. In such case, we are using the compareTo() 
 * method of String class, which internally provides the comparison logic.
 */

import java.util.*;  

class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
StudentComparator s1=(StudentComparator)o1;  
StudentComparator s2=(StudentComparator)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}  