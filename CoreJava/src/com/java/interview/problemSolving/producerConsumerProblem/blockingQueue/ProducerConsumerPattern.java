/*Producer Consumer Design Pattern with Blocking Queue Example in Java
 * 
Producer Consumer Design pattern is a classic concurrency or threading pattern 
which reduces coupling between Producer and Consumer by separating Identification of work 
with Execution of Work. In producer consumer design pattern a shared queue is used to control 
the flow and this separation allows you to code producer and consumer separately. 
It also addresses the issue of different timing require to produce item or consuming item. 
by using producer consumer pattern both Producer and Consumer Thread can work with different speed.

Producer consumer pattern is every where in real life and depict coordination and collaboration. 
Like one person is preparing food (Producer) while other one is serving food (Consumer), 
both will use shared table for putting food plates and taking food plates. Producer which is 
the person preparing food will wait if table is full and Consumer (Person who is serving food) 
will wait if table is empty. table is a shared object here. On Java library Executor framework 
itself implement Producer Consumer design pattern be separating responsibility of addition and 
execution of task.
*/

package com.java.interview.problemSolving.producerConsumerProblem.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {

    public static void main(String args[]){
  
     //Creating shared object
     BlockingQueue sharedQueue = new LinkedBlockingQueue();
 
     //Creating Producer and Consumer Thread
     Thread prodThread = new Thread(new Producer(sharedQueue));
     Thread consThread = new Thread(new Consumer(sharedQueue));

     //Starting producer and Consumer thread
     prodThread.start();
     consThread.start();
    }
 
}

/*Output:
Produced: 0
Produced: 1
Consumed: 0
Produced: 2
Consumed: 1
Produced: 3
Consumed: 2
Produced: 4
Consumed: 3
Produced: 5
Consumed: 4
Produced: 6
Consumed: 5
Produced: 7
Consumed: 6
Produced: 8
Consumed: 7
Produced: 9
Consumed: 8
Consumed: 9
*/