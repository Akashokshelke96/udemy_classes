package com.sourceCode.Lesson35Mlultithreading;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("Hello there!");

        Task1 taskRunner = new Task1();
        taskRunner.start();
        taskRunner.setName("A");


        Task1 taskRunner2 = new Task1();
        taskRunner2.start();
        taskRunner2.setName("B");


    }
}
class Task1 extends Thread{  //if instead we used "implements Runnable" then multithreading does not work, SQuential does.
    Task1(String name){
        super(name);
    }

    public Task1() {

    }

    public void run(){
        for(int i = 0 ; i<1000;i++){
            System.out.println("number" + i + " = " + Thread.currentThread().getName());//this current-thread method is to get the name of the THREAD with its OUTPUT
        }
    }

}

