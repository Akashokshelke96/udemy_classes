package Lesson41ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);

        Runnable processor2 = new MessageProcessor(3);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);

        Runnable processor4 = new MessageProcessor(4);
        executor.execute(processor4);

       executor.shutdown();//rejects any new task from being submitted .Gracefully shuts down the service
       executor.awaitTermination(10, TimeUnit.SECONDS);//THIS WILL MAKE IT WAIT UN-TILL 10 SECONDS TO WAIT BEFORE MOVING ON TO NEXT LINE
//        while(!executor.isTerminated()){
//            //this is infinite loop un-till executor is terminated..and the last sout statement will now be printed at last
//        }
        System.out.println("Submitted all tasks..");
    }
}

