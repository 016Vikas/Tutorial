package com.java.corejava.comparableComparator;

/*	This class provides comparison logic based on the name. In such case, we are using the compareTo()
method of String class, which internally provides the comparison logic.
*/

    import java.util.*;  

    class NameComparatorGen implements Comparator<StudentComparatorGen>{  
    public int compare(StudentComparatorGen s1,StudentComparatorGen s2){  
    return s1.name.compareTo(s2.name);  
    }  
    }  