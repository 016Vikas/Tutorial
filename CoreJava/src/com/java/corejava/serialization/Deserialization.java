package com.java.corejava.serialization;

import java.io.*;  

class Deserialization{  
 public static void main(String args[])throws Exception{  
    
	 ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name+" "+s.age+" "+s.contact);  
  
  in.close();  
 }  
}  

//211 ravi

