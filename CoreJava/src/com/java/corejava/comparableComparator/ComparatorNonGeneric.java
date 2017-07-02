package com.java.corejava.comparableComparator;

//	In this class, we are printing the objects values by sorting on the basis of name and age.

    import java.util.*;  
import java.io.*;  

    class ComparatorNonGeneric{  
    public static void main(String args[]){  
      
    ArrayList al=new ArrayList();  
    al.add(new StudentComparatorGen(101,"Vijay",23));  
    al.add(new StudentComparatorGen(106,"Ajay",27));  
    al.add(new StudentComparatorGen(105,"Jai",21));  
      
    System.out.println("Sorting by Name...");  
      
    Collections.sort(al,new NameComparator());  
    Iterator itr=al.iterator();  
    while(itr.hasNext()){  
    	StudentComparatorGen st=(StudentComparatorGen)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
      
    System.out.println("sorting by age...");  
      
    Collections.sort(al,new AgeComparator());  
    Iterator itr2=al.iterator();  
    while(itr2.hasNext()){  
    	StudentComparatorGen st=(StudentComparatorGen)itr2.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
      
      
    }  
    }  