package com.java.corejava.innerClass;

//	Java static nested class example with instance method

    class StaticNestedClass{  
      static int data=30;  
      static class Inner{  
       void msg(){System.out.println("data is "+data);}  
      }  
      public static void main(String args[]){  
    	  StaticNestedClass.Inner obj=new StaticNestedClass.Inner();  
      obj.msg();  
      }  
    }  
    
/*In this example, you need to create the instance of static nested class because it has instance method 
 msg(). But you don't need to create the object of Outer class because nested class is static and static 
 properties, methods or classes can be accessed without object.
*/    