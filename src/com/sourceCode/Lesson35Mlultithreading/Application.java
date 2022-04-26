package com.sourceCode.Lesson35Mlultithreading;

public class Application {

    public static void main(String[] args) { //main thread starts first by looking for the main method frist, and then starts the flow if another thread is seen to
        //Task taskRunner = new Task(); //so even if we used this thread above the SOUT statement still hello there will be printed first
        //taskRunner.start();     // as both the lines are executed at the same time not waiting for the other to finish
        System.out.println("Hello there!");

        Task taskRunner = new Task(); // usually a single thread program runs SEQUENTIALLY LINE BY LINE BUT IN MULTITHREADED PROGRAM BOTH RUNS
        taskRunner.start();                            // IN PARALLEL

        //taskRunner.start(); //it is ILLEGALTHREADEXCEPTION IF ONE THREAD IS TRIED TO BE RUN MORE THAN ONE TIME..ITS NOT POSSIBLE TO RUN THE SAME THREAD TWICE
                             //IT CAN BE DONE IF ANOTHER TASK INSTANCE IS USED TO START() THIS LOOP AGAIN LIKE THIS:
        Task taskRunner2 = new Task();
        taskRunner2.start(); //but the output will be mixed up and repeating as it runs in parallel..
    }
}
class Task extends Thread{
    public void run(){
        for(int i = 0 ; i<1000;i++){
            System.out.println("number" + i);
        }
    }

}
