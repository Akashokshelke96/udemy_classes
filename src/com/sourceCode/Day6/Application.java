package com.sourceCode.Day6;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<Integer>(); //duplicate values are not saved in hashset & it doesnt care about the order of output
        values.add(12);                                   //hence only UNIQUE values;
                                                          //linkedHashSet stored and output in ORDER but no duplicates allowed
        values.add(23);
        values.add(546);
        values.add(23);
        values.add(33);

        for (Integer value: values //advanced for each loop
             ) {
            System.out.println(value);

        }
    }
}
