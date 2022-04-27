package com.jobReady.Lesson39;


import java.util.List;

public class Producer implements Runnable {
    List<Integer> questionList = null; //questionList will be a shred resource between producer and consumer class
    final int LIMIT = 5;
    private int questionNo;


    public Producer(List<Integer> questionList){
        this.questionList =questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {
       synchronized (questionList) {
           while (questionList.size() == LIMIT) {
               System.out.println("Questions have piled Up..wait for answers");

                   questionList.wait();//wait method belongs to Object class and we are passing on control to any other Thread if they want access to this list
              //meaning this synchronised box has been put to wait
           }
       }
       synchronized (questionList){
           System.out.println("We have got a New Question " + questionNo );//this question no has been used as an input
           questionList.add(questionNo);
           Thread.sleep(100);
           questionList.notify();//notifies thread threads tht are waiting for the Notifications to wake up and continue processing
                      //i.e other thread can take over now , and i am done what i am doing ("anything waiting for this questionList thread to complete will be notified
       }

    }





    @Override
    public void run() {
        while(true) {
            try {
                readQuestion(questionNo++);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
