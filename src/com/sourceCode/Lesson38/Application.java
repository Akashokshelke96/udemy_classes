package com.sourceCode.Lesson38;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });
        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProduct();
            }
        });
        inventoryTask.start();
        //inventoryTask.join(); //this will make the first thread complete its function and then move on to next thread but this will kill the MULTITHREADING PURPOSE
        //so instead of both arraylist(not thread safe) we used CopyOnWriteArrayList (Thread safe) and instead of ".JOIN" we use thread sleep..
       Thread.sleep(2000);//this will make both the Methods using the same list simultaneously as MULTITHREADING
        displayTask.start();
    }
}
