package com.java.corejava.comparableComparator;

import java.util.*;  

class AgeComparatorGen implements Comparator<StudentComparatorGen>{  
public int compare(StudentComparatorGen s1,StudentComparatorGen s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  
