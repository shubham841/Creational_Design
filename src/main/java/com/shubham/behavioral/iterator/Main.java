package com.shubham.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library(books);
        Iterator iterator = library.createIterator();

        System.out.println("Books in the library:");
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.title+" "+book.author);
        }

    }
}
