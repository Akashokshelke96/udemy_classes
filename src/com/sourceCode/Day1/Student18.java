package com.sourceCode.Day1;

public class Student18 implements Cloneable {
        int rollNo;
        String name;

    Student18(int rollNo, String name){
            this.name = name;
            this.rollNo = rollNo;

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            Student18 s1 = new Student18(1123,"akash");

            Student18 student181 = (Student18) s1.clone();

            System.out.println(s1.name);
            System.out.println(student181.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
