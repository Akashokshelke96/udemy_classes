package com.sourceCode.Day8;

public class Employee implements Comparable<Employee> {         //object will be called in lesson 2
    String name;       // implementing the comparable interface with <emplo> as the parameter will do the SORTING we wanted
    int salary;
    String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary < o.salary)  {
            return -1;
        }
        else if(this.salary > o.salary){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
