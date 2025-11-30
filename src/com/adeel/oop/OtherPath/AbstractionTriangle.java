package com.adeel.oop.OtherPath;

public class AbstractionTriangle extends AbstractionShape{
    double base;
    double height;

    AbstractionTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    double area(){
        return 0.5 * base * height; // A = 1/2 × b × h
    }
}
