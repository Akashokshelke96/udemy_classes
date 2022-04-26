package com.sourceCode.Lesson37;

public class Application {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        Worker worker1 = new Worker(sequence);
        Worker worker2 = new Worker(sequence);
        worker1.start();
        worker2.start();

    }
}
class Worker extends Thread{
    Sequence sequence = new Sequence();
    public Worker(Sequence sequence){
        this.sequence = sequence;

    }
    public  void run() {
        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + " Has Value==" + sequence.getNext());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    }


