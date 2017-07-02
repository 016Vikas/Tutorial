package com.java.corejava.innerClass;

/*If you have the static member inside static nested class, you don't need to create instance of static 
 * nested class.
 */

    class StaticNestedClassExampleWithStaticMethod{  
      static int data=30;  
      static class Inner{  
       static void msg(){System.out.println("data is "+data);}  
      }  
      public static void main(String args[]){  
    	  StaticNestedClassExampleWithStaticMethod.Inner.msg();//no need to create the instance of static nested class  
      }  
    }  
