package com.java.concurrency;

/*
 * Thread.sleep causes the current thread to suspend execution for a specified period. 
 * This is an efficient means of making processor time available to the other threads 
 * of an application or other applications that might be running on a computer system.
 * However, these sleep times are not guaranteed to be precise, because they are limited 
 * by the facilities provided by the underlying OS.
 * Also, the sleep period can be terminated by interrupts.
 */
public class SleepMessages {
	
	/*
	 * Notice that main declares that it throws InterruptedException. 
	 * This is an exception that sleep throws when another thread interrupts the current thread 
	 * while sleep is active. 
	 * 
	 * Since this application has not defined another thread to cause 
	 * the interrupt, it doesn't bother to catch InterruptedException.
	 */
    public static void main(String args[]) throws InterruptedException {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

       /* for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }*/
        
        /*modified as follows to support interrupts*/
        for (int i = 0; i < importantInfo.length; i++) {
            // Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(importantInfo[i]);
        }
        
        
        
        /*What if a thread goes a long time without invoking a method that throws InterruptedException? 
         * Then it must periodically invoke Thread.interrupted, which returns true if an interrupt 
         * has been received. For example:
        */
        		for (int i = 0; i < importantInfo.length; i++) {
        		    heavyCrunch(importantInfo[i]);
        		    if (Thread.interrupted()) {
        		        // We've been interrupted: no more crunching.
        		        return;
        		    }
        		}
        	
         /*In this simple example, the code simply tests for the interrupt and exits the thread 
          * if one has been received. In more complex applications, it might make more sense to 
          * throw an InterruptedException:
          */
        		if (Thread.interrupted()) {
        		    throw new InterruptedException();
        		}
        //This allows interrupt handling code to be centralized in a catch clause.

    }

	private static void heavyCrunch(String string) {
		// TODO Auto-generated method stub
		
	}
    
    /*
     * The Interrupt Status Flag : The interrupt mechanism is implemented using an internal flag 
     * known as the interrupt status. Invoking Thread.interrupt sets this flag. 
     * When a thread checks for an interrupt by invoking the static method Thread.interrupted, 
     * interrupt status is cleared. The non-static isInterrupted method, 
     * which is used by one thread to query the interrupt status of another, does not change
     *  the interrupt status flag.
     * By convention, any method that exits by throwing an InterruptedException clears interrupt status when it does so. However, it's always possible that interrupt status will immediately be set again, by another thread invoking interrupt.

     */
    		
}

