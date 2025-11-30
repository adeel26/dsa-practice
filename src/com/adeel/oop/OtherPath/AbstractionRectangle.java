package com.adeel.oop.OtherPath;

public class AbstractionRectangle extends AbstractionShape{
    double length;
    double width;

    AbstractionRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    double area(){
        return length * width; // A = L × W
    }
}
