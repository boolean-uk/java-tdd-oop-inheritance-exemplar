package com.booleanuk.core;

public class Book extends LibraryItem {

    public Book(String title, Author author) {
        super(title);
        this.setAuthor(author);
    }
}
