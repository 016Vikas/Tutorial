package com.java.corejava.innerClass;

    abstract class Person1{  
        abstract void eat();  
      }  
      class AnonymousInnerClass{  
       public static void main(String args[]){  
    	   Person1 p=new Person1(){  
        void eat(){System.out.println("nice fruits");}  
        };  
        p.eat();  
       }  
      }  
