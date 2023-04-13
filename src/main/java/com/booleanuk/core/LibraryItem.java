package com.booleanuk.core;

public class LibraryItem {
    String title;
    Author author = null;

    boolean onLoan = false;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "item is not currently on loan";
        }

        this.onLoan = false;

        return "item has been checked in";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "item is currently on loan";
        }

        this.onLoan = true;

        return "item has been checked out";
    }
}
