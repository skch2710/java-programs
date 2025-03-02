package collections.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * ConcurrentLinkedQueue is a thread-safe, non-blocking queue in Java 
 * that is part of the java.util.concurrent package. 
 * It is based on a lock-free, linked-node implementation and 
 * follows FIFO (First-In-First-Out) order.
 */
public class ConcurrentQueueExample {
	
    public static void main(String[] args) {
    	
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Adding elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        queue.add(2); //Allows Duplicates 
        
        // Retrieving and removing elements
        System.out.println(queue.poll()); // 1
        
        System.out.println(queue.peek()); // 2 (does not remove)
        
        System.out.println(queue);
    }
}

