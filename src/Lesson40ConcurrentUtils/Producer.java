package Lesson40ConcurrentUtils;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> questionQueue;
    int questionNo;
    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println(("Got New Questions :" + nextQuestion));
                    questionQueue.put(nextQuestion); //PUT AND TAKE METHODS ARE THREADSAFE NOT THE ADD AND REMOVE
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
