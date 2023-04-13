package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        Article article = new Article("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void authorIsCorrectlySet() {
        Author author = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals(author, article.getAuthor());

        String expected = "Name: John Latham Email: john@latham.com Website: latham.com Tel No: 0161 343 4343";
        Assertions.assertEquals(expected, article.getAuthor().getDetails());
    }
}
