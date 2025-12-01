package com.adeel.oop.KK;


class Student {
    String name;
    int rollno;
    float marks;

    // Constructor
    Student(String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: " + marks);
    }
}


public class Constructor {
    public static void main(String[] args) {
        Student std1 = new Student("John", 234, 545.5f);
        Student std2 = new Student("Cena", 432, 658f);

        std1.displayStudentDetails();
        System.out.println("*****************");
        std2.displayStudentDetails();
    }
}

/*
✅ 1. What is a Constructor?
A constructor is a special method that runs automatically when you create an object with new.
It is used to set initial values for the object.


✅ 2. What does this keyword mean?
this means "current object".
Inside the constructor:

this.name = name;

Left side = object’s variable
Right side = constructor’s input variable

Without this, Java gets confused:
name = name; → which one?
this.name → object's field
name → constructor parameter


✅ 3. What happens in Memory?
When you do:
Student std1 = new Student("John", 234, 545.5f);

Stack and Heap diagram:
STACK                                HEAP
----------------------------------------------
std1  ------->   (address) ------>  GamesClass object
                                      ├── name = "John" (ref)
                                      ├── rollno = 234
                                      └── marks = 545.5
                                      └── displayStudentDetails() [code area]
                     STRING POOL (inside heap)
                     --------------------------
                     "John"

std1 reference lives in STACK
The actual object lives in HEAP
String values also live in heap (String Pool)
 */