package com.sourceCode.Day3;
class MyClass implements AutoCloseable{//autocloseabel can close the resources mentioned in the close() method

    @Override
    public void close() throws Exception {
        System.out.println("closing");
    }
}

public class Application2 {
    public static void main(String[] args) {
        try(MyClass var = new MyClass();){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
