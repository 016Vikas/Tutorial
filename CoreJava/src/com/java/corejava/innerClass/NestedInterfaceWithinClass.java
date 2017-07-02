package com.java.corejava.innerClass;

    class A{  
        interface Message{  
         void msg();  
        }  
      }  
        
      class NestedInterfaceWithinClass implements A.Message{  
       public void msg(){System.out.println("Hello nested interface");}  
        
       public static void main(String args[]){  
        A.Message message=new NestedInterfaceWithinClass();//upcasting here  
        message.msg();  
       }  
      }  