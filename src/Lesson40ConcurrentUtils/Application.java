package Lesson40ConcurrentUtils;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Application {
    public static void main(String[] args) { //ARRAYbLOCKINGqUEUE IS THE THREADSAFE QUEUE therefore wait and notify methods are not used
        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5); //takes argument as Capacity...we used LIMIT int earlier
        Thread t1 = new Thread(new Producer(questionQueue));//question queue will be the shared object between the two
        Thread t2 = new Thread(new Consumer(questionQueue));
        t1.start();
        t2.start();

    }
}
