package com.sourceCode.Day7;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        //creating hashset for animals
        HashSet<Animal> animals = new HashSet<Animal>();

        //creating animal objects
        Animal animal1 = new Animal("Lion",12);
        Animal animal2 = new Animal("Rabbit",1);
        Animal animal3 = new Animal("Snake",13);
        Animal animal4 = new Animal("Tiger",7);
        Animal animal5 = new Animal("Akash",26);
        Animal animal6 = new Animal("Rabbit",1);

        //adding animals object in to animals hashset
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);//this is the repeated object and is also used in the hashset which only caters to UNIQUE values;
        //but using the EQUALS override in the animals classes we can tackle this shortfall .i.e field to field comparison is done
        //removing this EQUALS method will print even teh repeated elements in the HASHSET.

        System.out.println(animal2.equals(animal6)); //if removed OVERRIDE toEquals method it will show false

        System.out.println(animal2.hashCode()); //using the OVerRIDE hashcode method we made the hashcode of these objects as same

        System.out.println(animal6.hashCode());//otherwise they would have been different and not been equals.
        //because hashset uses HASHCODE to check weather 2 objects are same or not and only stores UNIQUE values.


        for (Animal values: animals
             ) {
            System.out.println(values);

        }

    }
}
