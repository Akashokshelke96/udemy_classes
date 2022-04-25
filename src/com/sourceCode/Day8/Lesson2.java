package com.sourceCode.Day8;

import java.util.*;

public class Lesson2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(15);
        hashSet.add(18);
        hashSet.add(17);

        //CONVERTING THE HASHSET IN TO A LIST FROM THE FOLLOWING COMMAND; to sort it , as hashSet can be sorted

        List<Integer> list2 = new ArrayList<Integer>(hashSet); //passing the hashset as input to LIST generating command
        Collections.sort(list2); //sorting the hashSet as hashset cannot be sorted by this command;
        System.out.println(list2);

        //SIMILARLY IT CAN ALSO SORT OUT THE STRINGS BASED ON ALPHABETICAL ORDER JUST CONVERT THE SET IN TO A ARRAYLIST ADN SORT
        //USING COLLECTIONS.SORT;


        // NOW TO SORT A CLASS WHICH IS A COMPLEX CLASS WITH VARIOUS ATTRIBUTES WE HAVE TO PROVIDE THE "BASIS" ON WHICH IT HAS TO SORT THE
        // CONTENT
        //EMPLOYEE TO implements THE COMPARABLE CLASS
        HashSet<Employee> employees = new HashSet<Employee>();
        Employee employee1 = new Employee("akash",1000,"product");
        Employee employee2 = new Employee("nishu",2000,"service");
        Employee employee3 = new Employee("prakash",20000,"serve");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        List<Employee> employeeList = new ArrayList<Employee>(employees);

        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}
