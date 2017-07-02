package com.java.concurrency.Synchronization;

/*
 * Interference happens when two operations, running in different threads, 
 * but acting on the same data, interleave. 
 */
public class ThreadInterference {

	private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
/*
 * Thread A's result is lost, overwritten by Thread B. This particular interleaving is only one possibility. 
 * Under different circumstances it might be Thread B's result that gets lost, or there could be no error at all.
 *  Because they are unpredictable, thread interference bugs can be difficult to detect and fix.
 */
}
