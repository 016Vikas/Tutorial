package com.java.corejava.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
 
/**
 * @author Crunchify.com
 *
 */
 
public class ConcurrentHashMapVsSynchronizedMap {
 
	public final static int THREAD_POOL_SIZE = 5;
 
	public static Map<String, Integer> crunchifyHashTableObject = null;
	public static Map<String, Integer> crunchifySynchronizedMapObject = null;
	public static Map<String, Integer> crunchifyConcurrentHashMapObject = null;
 
	public static void main(String[] args) throws InterruptedException {
 
		// Test with Hashtable Object
		crunchifyHashTableObject = new Hashtable<String, Integer>();
		crunchifyPerformTest(crunchifyHashTableObject);
 
		// Test with synchronizedMap Object
		crunchifySynchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());
		crunchifyPerformTest(crunchifySynchronizedMapObject);
 
		// Test with ConcurrentHashMap Object
		crunchifyConcurrentHashMapObject = new ConcurrentHashMap<String, Integer>();
		crunchifyPerformTest(crunchifyConcurrentHashMapObject);
 
	}
 
	public static void crunchifyPerformTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException {
 
		System.out.println("Test started for: " + crunchifyThreads.getClass());
		long averageTime = 0;
		for (int i = 0; i < 5; i++) {
 
			long startTime = System.nanoTime();
			ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
 
			for (int j = 0; j < THREAD_POOL_SIZE; j++) {
				crunchifyExServer.execute(new Runnable() {
					@SuppressWarnings("unused")
					@Override
					public void run() {
 
						for (int i = 0; i < 500000; i++) {
							Integer crunchifyRandomNumber = (int) Math.ceil(Math.random() * 550000);
 
							// Retrieve value. We are not using it anywhere
							Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));
 
							// Put value
							crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
						}
					}
				});
			}
 
			// Make sure executor stops
			crunchifyExServer.shutdown();
 
			// Blocks until all tasks have completed execution after a shutdown request
			crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
 
			long entTime = System.nanoTime();
			long totalTime = (entTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("2500K entried added/retrieved in " + totalTime + " ms");
		}
		System.out.println("For " + crunchifyThreads.getClass() + " the average time is " + averageTime / 5 + " ms\n");
	}
}

/*
Result
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
	
Test started for: class java.util.Hashtable
500K entried added/retrieved in 1432 ms
500K entried added/retrieved in 1425 ms
500K entried added/retrieved in 1373 ms
500K entried added/retrieved in 1369 ms
500K entried added/retrieved in 1438 ms
For class java.util.Hashtable the average time 1407 ms
 
Test started for: class java.util.Collections$SynchronizedMap
500K entried added/retrieved in 1431 ms
500K entried added/retrieved in 1460 ms
500K entried added/retrieved in 1387 ms
500K entried added/retrieved in 1456 ms
500K entried added/retrieved in 1406 ms
For class java.util.Collections$SynchronizedMap the average time 1428 ms
 
Test started for: class java.util.concurrent.ConcurrentHashMap
500K entried added/retrieved in 413 ms
500K entried added/retrieved in 351 ms
500K entried added/retrieved in 427 ms
500K entried added/retrieved in 337 ms
500K entried added/retrieved in 339 ms
For class java.util.concurrent.ConcurrentHashMap the average time 373 ms  <== Much 
*/