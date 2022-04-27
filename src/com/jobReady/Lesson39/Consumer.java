package com.jobReady.Lesson39;

import java.util.List;

public class Consumer  implements Runnable{

    List<Integer> questionList = null; //questionList will be a shred resource between producer and consumer class


    public Consumer(List<Integer> questionList){
        this.questionList =questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList) {
            while (questionList.isEmpty()) {
                System.out.println("No Questions to answer...Waiting for Questions");

                questionList.wait();//wait method belongs to Object class and we are passing on control to any other Thread if they want access to this list
                //meaning this synchronised box has been put to wait
            }
        }
        synchronized (questionList){
            Thread.sleep(5000); //suppose it takes 5 seconds to answer the question
            System.out.println("Answered Question No :" + questionList.remove(0) );//removing from the front of the list i.e first element
            questionList.notify();//notifies thread threads tht are waiting for the Notifications to wake up and continue processing
            //i.e other thread can take over now , and i am done what i am doing ("anything waiting for this questionList thread to complete will be notified
        }

    }





    @Override
    public void run() {
        while(true) {
            try {
                answerQuestion();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

