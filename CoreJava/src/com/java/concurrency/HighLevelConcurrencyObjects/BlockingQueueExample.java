package com.java.concurrency.HighLevelConcurrencyObjects;

/*
 * The java.util.concurrent.BlockingQueue interface defines a get method that blocks if the queue is empty, 
 * and a put methods that blocks if the queue is full. These are effectively the same operations defined by 
 * Drop — except that Drop is not a queue! However, there's another way of looking at Drop: it's a queue with 
 * a capacity of zero. Since there's no room in the queue for any elements, every get blocks until the 
 * corresponding take and every take blocks until the corresponding get. There is an implementation of 
 * BlockingQueue with precisely this behavior: java.util.concurrent.SynchronousQueue.	
 * 
 * BlockingQueue is almost a drop-in replacement for Drop. The main problem in Producer is that with 
 * BlockingQueue, the put and get methods throw InterruptedException. This means that the existing try must 
 * be moved up a level:	import java.util.Random;
 * 	
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

//	For ProducerConsumerExample, we simply change the declaration for the drop object: 



	public class BlockingQueueExample {
	    public static void main(String[] args) {
	        BlockingQueue<String> drop =
	            new SynchronousQueue<String> ();
	        (new Thread(new Producer(drop))).start();
	        (new Thread(new Consumer(drop))).start();
	    }
//	}

}
