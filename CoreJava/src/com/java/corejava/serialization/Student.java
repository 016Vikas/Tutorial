package com.java.corejava.serialization;

import java.io.Serializable;  
public class Student implements Serializable{  
 /**
	 * 
	 */
	private static final long serialVersionUID = 226238662088462748L;
int id;  
 String name;  
 transient int age;//Now it will not be serialized  
 static String contact; 
 
 public Student(int id, String name,int age, String contact) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
  this.contact = contact;
 }  
}  

