package com.java.corejava.innerClass;

    interface Showable{  
        void show();  
        interface Message{  
         void msg();  
        }  
      }  
      class NestedInterfaceWithinInterface implements Showable.Message{  
       public void msg(){System.out.println("Hello nested interface");}  
        
       public static void main(String args[]){  
        Showable.Message message=new NestedInterfaceWithinInterface();//upcasting here  
        message.msg();  
       }  
      }  
      
/*
 * As you can see in the above example, we are acessing the Message interface by its outer interface 
 * Showable because it cannot be accessed directly. It is just like almirah inside the room, we cannot 
 * access the almirah directly because we must enter the room first. In collection frameword, sun 
 * microsystem has provided a nested interface Entry. Entry is the subinterface of Map i.e. accessed by 
 * Map.Entry.
 *
 */
      