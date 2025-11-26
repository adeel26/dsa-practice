package com.adeel.oop.OtherPath;

public class SuperEmployee extends SuperPerson{
    int salary;

    SuperEmployee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
