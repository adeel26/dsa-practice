package com.adeel.oop.OtherPath;

public class CarMain {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();
        car.isRunning = true;

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println("******");

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();

        // Student class
        System.out.println("Student Class");

        Student student1 = new Student("John", 30, 3.2);
        Student student2 = new Student("Cena", 25, 2.5);
        Student student3 = new Student("Batista", 26, 3.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}
