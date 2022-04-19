package com.sourceCode.Day4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList();
        words.add("akash");
        words.add("12");
        words.add("there");
        words.remove("there");
        words.add("shelke");
        words.add("12");

//        int item1 = (int) words.get(1);
//        int item2 =  (int) words.get(3);
//        System.out.println(item1 + item2);

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(23);
        list.add(3);
        list.add(2);
        list.add(33);
        list.add(233);
        for (int number:list) {
            System.out.println(number);

        }

        System.out.println(list.get(0));
    }
}
