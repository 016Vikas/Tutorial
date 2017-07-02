package com.java.concurrency;

// File Name : DisplayMessage.java
// Create a thread to implement Runnable


public class DisplayMessageRunnable implements Runnable {
   private String message;
   
   public DisplayMessageRunnable(String message) {
      this.message = message;
   }
   
   public void run() {
      while(true) {
         System.out.println(message);
      }
   }
}
