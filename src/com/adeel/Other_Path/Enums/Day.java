package com.adeel.Other_Path.Enums;

public enum Day {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    // Constructor
    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    // Getter Method
    public int getDayNumber(){
        return this.dayNumber;
    }

}
