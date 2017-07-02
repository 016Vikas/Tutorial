package com.java.interview.problemSolving.deadlock;

public class DeadlockSimulation {

	 String str1 = "Java";
	 String str2 = "UNIX";
	 
	 public static void main(String a[]){
		 DeadlockSimulation deadlockSimulation = new DeadlockSimulation();
		 deadlockSimulation.thread1.start();
		 deadlockSimulation.thread2.start();
	    }
	     
	    Thread thread1 = new Thread("My Thread 1"){
	        public void run(){
	            while(true){
	                synchronized(str1){
	                    synchronized(str2){
	                        System.out.println(str1 + str2);
	                    }
	                }
	            }
	        }
	    };
	     
	    Thread thread2 = new Thread("My Thread 2"){
	        public void run(){
	            while(true){
	                synchronized(str2){
	                    synchronized(str1){
	                        System.out.println(str2 + str1);
	                    }
	                }
	            }
	        }
	    };
	     
	   
}
