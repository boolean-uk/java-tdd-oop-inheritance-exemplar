package com.booleanuk.core;

public class Article extends LibraryItem {

    public Article(String title, Author author) {
        super(title);
        this.setAuthor(author);
    }
}
