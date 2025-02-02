package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>(); // FIFO
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b -> a -> c
//        var front = queue.remove(); // removes the element at the front of the queue, but throws an exception if the queue is empty.
        var front = queue.poll(); // removes the element at the front of the queue, but return null if the queue is empty.
//        var front = queue.peek();// returns the element at the front of the queue, but does not remove it.
//        var front = queue.element(); // returns the element at the front of the queue, but throws an exception if the queue is empty.
        System.out.println(front);
        System.out.println(queue);


//        queue.offer("d"); // returns false if queue is full, the difference between add and offer is that add throws an exception if the queue is full.
        // d -> b -> a -> c   (c at the front)
    }
}
