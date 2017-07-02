package com.java.corejava.serialization;

/*In this example, we are going to serialize the object of Student class. 
 * The writeObject() method of ObjectOutputStream class provides the functionality to 
 * serialize the object. We are saving the state of the object in the file named f.txt.
 */

import java.io.*;  

class Persist {  

public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi",22,"contact");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
 
}  


//success
