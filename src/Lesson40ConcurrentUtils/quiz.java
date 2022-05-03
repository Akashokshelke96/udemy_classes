package Lesson40ConcurrentUtils;

import java.util.HashMap;
import java.util.HashSet;

public class quiz {
    public static void main(String[] args) {
        try {
            myMethod();
            System.out.println("one");
        }
        catch (Exception ex){
            System.out.println("two");
        }
        finally {
            System.out.println("three");
        }
        System.out.println("four");

    }
    public static void myMethod(){
        throw new Error();
    }

}
