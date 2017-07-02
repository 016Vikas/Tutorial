package com.java.concurrency;

/*
 * Provide a Runnable object. 
 * The Runnable interface defines a single method, run, 
 * meant to contain the code executed in the thread. 
 * The Runnable object is passed to the Thread constructor, 
 * as in the HelloRunnable example: 
 */
/*public class DefiningAndStartingAThread implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new DefiningAndStartingAThread())).start();
    }

}*/

/*Subclass Thread. 
 * The Thread class itself implements Runnable, though its run method does nothing. 
 * An application can subclass Thread, providing its own implementation of run, 
 * as in the HelloThread example:
 * */ 


public class DefiningAndStartingAThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new DefiningAndStartingAThread()).start();
    }

}