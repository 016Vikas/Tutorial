package com.java.corejava.comparableComparator;

    import java.util.*;  
import java.io.*;  

    class ComparatorGeneric{  
    public static void main(String args[]){  
      
    ArrayList<StudentComparatorGen> al=new ArrayList<StudentComparatorGen>();  
    al.add(new StudentComparatorGen(101,"Vijay",23));  
    al.add(new StudentComparatorGen(106,"Ajay",27));  
    al.add(new StudentComparatorGen(105,"Jai",21));  
      
    System.out.println("Sorting by Name...");  
      
    Collections.sort(al,new NameComparator());  
    for(StudentComparatorGen st: al){  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
      
    System.out.println("sorting by age...");  
      
    Collections.sort(al,new AgeComparator());  
    for(StudentComparatorGen st: al){  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
      
    }  
    }  
