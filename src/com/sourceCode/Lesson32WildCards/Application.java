package com.sourceCode.Lesson32WildCards;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Object myObj = new Object();
        String myVar = new String();
        myObj = myVar; //since String class extends OBJECT class and child class instance can easily be equated to parent class

        Employee employee = new Employee();
        Accountant accountant = new Accountant();
        employee = accountant; //this is a valid java code which is not the case below

        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        accountants.add(new Accountant());
        employees.add(new Employee());


        //  employees = accountants; //its not gonna work as generics only provide LIMITED flexibility

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<String> accountants2 = new ArrayList<String>();
        employees2 = accountants2; //this is valid code as we used WildCard here above <?> similar to a raw object , Java doesnt know which type is there

        //UPPER BOUND USES "EXTENDS"
        ArrayList<? extends Employee> employees3 = new ArrayList<>();//only children of the Employee class can be EQUATED it with
        ArrayList<Accountant> accountants3 = new ArrayList<Accountant>(); //here Employee is the UpperBound i.e the highest class that can be used here
        employees3 = accountants3;                                  //ALL THIS ALSO WORKS EVEN IF THE EMPLOYEE WAS AN INTERFACE AND ACCOUNTANT IMPLEMENTS EMPLOYEE


        //LOWER BOUND USES KEYWORD "SUPER"
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Accountant> accountants4 = new ArrayList<Accountant>(); //IF accountant was replaced with OBJECT, this could have worked
        //    employees4 = accountants4; //this is not allowed as NO CLASS BELOW EMPLOYEE CAN BE USED HERE , I.E ACCOUNTANT(CHILD CLASS)
        //ONLY OBJECT CLASS WHICH IS THE PARENT OF EMPLOYEE OR ANY OTHER CLASS IS  COULD HAVE BEEN EQUATED IT WITH

        makeEmployeeWork(employees);
        makeEmployeeWork(accountants);//this wouldnt work if EXTENDS was not used in the method below, as now it allows the child classes of employees to be used also
    }

    public static void makeEmployeeWork(List<? extends Employee> employees) {//upper bound i.e only children of this class Employee
        for (Employee emp : employees)   //"?" here means all the CHILDREN classes of the EMPLOYEE class can be called here.
        {
            emp.work();
        }
    }

    public static void makeEmployeeWork2(List<? extends Employee> employees) {
        for (Accountant act : (ArrayList<Accountant>) employees) //down casted using the arraylist<Accountant> class
        {
            act.work();
        }
    }

//    SIMILARLY IT WILL WORK FOR HR MANAGER BY TYPE CASTING...DONT USE IT OFTEN AS TYPE SAFETY IS MEANING LESS WITH IT TO SOME EXTENT
}
