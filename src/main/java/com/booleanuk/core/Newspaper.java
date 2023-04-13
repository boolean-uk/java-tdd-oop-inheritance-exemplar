package com.booleanuk.core;

public class Newspaper extends LibraryItem {

    public Newspaper(String title) {
        super(title);
    }

    @Override
    public String checkIn() {
        return "newspapers are not available for loan";
    }

    @Override
    public String checkOut() {
        return "newspapers are not available for loan";
    }

    @Override
    public Author getAuthor() {
        return null;
    }

    @Override
    public void setAuthor(Author author) {
        System.out.println("This is not permitted, newspapers do not have a single author.");
    }
}
