package com.adeel.oop.OtherPath;

public class SuperMain {
    public static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        SuperPerson person = new SuperPerson("John", "Cena");
        person.showName();

        SuperStudent student = new SuperStudent("Harry", "Potter", 3.0);
        student.showName();
        student.showGPA();

        SuperEmployee employee = new SuperEmployee("Tom","Riddle", 500000);
        employee.showSalary();
    }
}
