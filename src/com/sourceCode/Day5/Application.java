package com.sourceCode.Day5;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("lion");
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");

//        for (String animal:animals){
//            System.out.println(animal);
//        }
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("toyota","camary",12000,true);

        vehicles.add(new Vehicle("honda","Accord",10000,false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("jeep","wrangler",25000,true));

//        for (Vehicle car:vehicles){
//            System.out.println(car); //we created toString method in the vehicle class to tackle the hashcode representation in this loop earlier
//        }
        printElements(vehicles);//this method words on both vehicles Arraylist and animals arraylist or linkedList
        printElements(animals);
        }

        public  static void printElements(List someList){//this is to print every  type of list we have made so far in this class;
            for (Object animal:someList){
                System.out.println(animal);
                System.out.println(someList.isEmpty());
         }
        }




    }

