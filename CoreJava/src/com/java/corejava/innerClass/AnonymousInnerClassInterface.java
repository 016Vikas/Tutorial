package com.java.corejava.innerClass;

    interface Eatable{  
        void eat();  
       }  
       class AnonymousInnerClassInterface{  
        public static void main(String args[]){  
        Eatable e=new Eatable(){  
         public void eat(){System.out.println("nice fruits");}  
        };  
        e.eat();  
        }  
       }  
