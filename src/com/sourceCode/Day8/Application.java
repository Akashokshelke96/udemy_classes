package com.sourceCode.Day8;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);
        list1.add(17);




        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(233);
        list2.add(17);

   //     list1.removeAll(list2);//removing list2 items from list 1;
//        list1.addAll(list2);
        boolean hasValue = list1.contains(15);
        System.out.println(hasValue);
        System.out.println(list1.contains(14));
        System.out.println(list1.isEmpty());

        //retain all saves only those elements mentioned in list 2 from list 1;

        list1.retainAll(list2);
        System.out.println(list1);//the common item betn the two list remains only


       // System.out.println(list1);

    }
}
