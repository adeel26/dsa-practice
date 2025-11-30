package com.adeel.oop.OtherPath;

public class AbstractionMain {
    public static void main(String[] args) {
        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features.
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        AbstractionCircle circle = new AbstractionCircle(5);
        AbstractionTriangle triangle = new AbstractionTriangle(3,9);
        AbstractionRectangle rectangle = new AbstractionRectangle(8,12);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
