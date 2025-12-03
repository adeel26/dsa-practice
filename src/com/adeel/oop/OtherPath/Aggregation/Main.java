package com.adeel.oop.OtherPath.Aggregation;

public class Main {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as  part of its structure,
        //               but the contained object or objects can exist independently.

        Book book1 = new Book("Lord of rings", 425);
        Book book2 = new Book("Harry Potter: Goblet of fire", 510);
        Book book3 = new Book("Game of thrones", 851);

        Book[] books = {book1, book2, book3};

        for(Book book : books) {
            System.out.println(book.displayInfo());
        }

        Library library = new Library("Public Library", 2005, books);
        library.displayInfo();
    }
}
