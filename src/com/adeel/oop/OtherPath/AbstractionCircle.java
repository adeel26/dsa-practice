package com.adeel.oop.OtherPath;

public class AbstractionCircle extends AbstractionShape{
    double radius;

    // Constructor
    AbstractionCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius; // A = π r²
    }
}
