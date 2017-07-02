package com.java.corejava.comparableComparator;

/*This class defines comparison logic based on the age. If age of first object is greater than the second, 
 * we are returning positive value, it can be any one such as 1, 2 , 10 etc. If age of first object is less
 * than the second object, we are returning negative value, it can be any negative value and if age of both 
 * objects are equal, we are returning 0.
 * 
 */
    import java.util.*;  

    class AgeComparator implements Comparator{  
    public int compare(Object o1,Object o2){  
    StudentComparator s1=(StudentComparator)o1;  
    StudentComparator s2=(StudentComparator)o2;  
      
    if(s1.age==s2.age)  
    return 0;  
    else if(s1.age>s2.age)  
    return 1;  
    else  
    return -1;  
    }  
    }  
