package com.java.corejava;

class Simple{}  
interface My{}  
  
class Reflection{  
 public static void main(String args[]){  
  try{  
	  /*1) getClass() method of Object class
	  It returns the instance of Class class. It should be used if you know the type. Moreover, it can be used with primitives.
	 */
	 	   Simple s=new Simple();  
	 	  Reflection t=new Reflection();  
	 	   t.printName(s);
	 	   System.out.println(s.getClass().getName());
	    
	 /*2) The .class syntax
	 If a type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type.
	 It can be used for primitive data type also.*/
	 		 Class c = boolean.class; 
	 		 Class c2 = Reflection.class; 
	 		  
	 		 System.out.println(c.getName());  
	          System.out.println(c2.getName());
	 		   
	 /*3) forName() method of Class class is used to load the class dynamically. returns the instance of Class class.
	 It should be used if you know the fully qualified name of class.This cannot be used for primitive types.
	 */
	 	Object obj= Class.forName("com.java.corejava.Simple");
	 	System.out.println(obj.getClass());

	 /*	Determining the class object

	 	   Following methods of Class class is used to determine the class object:
	 	   1) public boolean isInterface(): determines if the specified Class object represents an interface type.
	 	   2) public boolean isArray(): determines if this Class object represents an array class.
	 	   3) public boolean isPrimitive(): determines if the specified Class object represents a primitive type.
	 	   Let's see the simple example of reflection api to determine the object type.
	 	   */
	 	 Class c1=Class.forName("com.java.corejava.Simple1");  
	      System.out.println(c.isInterface());  
	        
	      Class c3=Class.forName("com.java.corejava.My1");  
	      System.out.println(c2.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
  
 }  
 
 void printName(Object obj){  
 Class c=obj.getClass();    
 System.out.println(c.getName());
  
 } 
}  