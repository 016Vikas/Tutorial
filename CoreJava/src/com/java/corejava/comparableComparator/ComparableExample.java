package com.java.corejava.comparableComparator;

import java.util.*;  
import java.io.*;  

public class ComparableExample{  
public static void main(String args[]){  
ArrayList<StudentComparable> al=new ArrayList<StudentComparable>();  
al.add(new StudentComparable(101,"Vijay",23));  
al.add(new StudentComparable(106,"Ajay",27));  
al.add(new StudentComparable(105,"Jai",21));  
  
Collections.sort(al);  
for(StudentComparable st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  