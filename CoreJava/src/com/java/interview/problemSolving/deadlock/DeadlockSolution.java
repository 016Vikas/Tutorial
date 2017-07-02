package com.java.interview.problemSolving.deadlock;

public class DeadlockSolution {
	   public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) {
	      ThreadDemo1 T1 = new ThreadDemo1();
	      ThreadDemo2 T2 = new ThreadDemo2();
	      T1.start();
	      T2.start();
	   }

	   
	   private static class ThreadDemo1 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try {
	               Thread.sleep(10);
	            }catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }
	   
	   private static class ThreadDemo2 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 2: Holding lock 1...");
	           
	            try {
	               Thread.sleep(10);
	            }catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }
}
/*
 So just changing the order of the locks prevent the program in going into a deadlock situation and completes with the following result −
Output
Thread 1: Holding lock 1...
Thread 1: Waiting for lock 2...
Thread 1: Holding lock 1 & 2...
Thread 2: Holding lock 1...
Thread 2: Waiting for lock 2...
Thread 2: Holding lock 1 & 2...
The above example is to just make the concept clear, however, it is a complex concept and you should deep dive into it before you develop your applications to deal with deadlock situations.
*/

