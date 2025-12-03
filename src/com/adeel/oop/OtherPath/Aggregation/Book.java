package com.adeel.oop.OtherPath.Aggregation;

public class Book {

    String title;
    int pages;

    // Constructor
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }
}
