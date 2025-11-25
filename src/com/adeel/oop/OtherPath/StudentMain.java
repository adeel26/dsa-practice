package com.adeel.oop.OtherPath;

public class StudentMain {
    public static void main(String[] args) {
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
