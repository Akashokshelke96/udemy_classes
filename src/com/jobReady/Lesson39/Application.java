package com.jobReady.Lesson39;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> questionList = new ArrayList<Integer>();

        Thread t1 = new Thread(new Producer(questionList));//this will populate the question list
        Thread t2 = new Thread(new Consumer(questionList));//this will also access the same ds question list

        t1.start();
        t2.start();

    }
}
