package com.sourceCode.Day9Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
//        Container<Integer,String> container = new Container<>(12,"hello"); //here in the <> we can use any DT as we have already used i1 adn i2
//                                                                       // in the container class which makes it pure GENERICS
//        int var1 = container.getItem1();
//        String var2 = container.getItem2();
//        Container<Double,Integer>container2 = new Container<>(12.333,112); // we can create another similar container instance with
//        //double and and integer as DT as we have used i1 and i2 generic dt parameter in Container Class
//        container2.printItems();

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("akash");
        mySet1.add("nishu");
        mySet1.add("marries");
        mySet1.add("have kids");

        Set<String> myset2 = new HashSet<>();
        myset2.add("first");
        myset2.add("akash");
        myset2.add("nishu");


        Set<String> resultSet = union(mySet1,myset2);

        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()){
            String var =itr.next();
            System.out.println(var);
        }


    }



    public static <E> Set<E> union(Set<E> set1,Set<E> set2){ //this is called a generic class

        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return  result;

    }
}
