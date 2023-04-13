package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    // Test adding books, articles and newspapers to the stock
    @Test
    public void testAddingBook() {
        Library library = new Library();
        String title = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(title, bookAuthor);
        library.addToStock(book);

        Assertions.assertTrue((long) library.items.size() > 0);
        Assertions.assertTrue(library.items.contains(book));
    }

    @Test
    public void testAddingArticle() {
        Library library = new Library();
        String title = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(title, articleAuthor);
        library.addToStock(article);

        Assertions.assertTrue((long) library.items.size() > 0);
        Assertions.assertTrue(library.items.contains(article));
    }

    @Test
    public void testAddingNewspaper() {
        Library library = new Library();
        String title = "The Daily Java";
        LibraryItem newspaper = new Newspaper(title);
        library.addToStock(newspaper);

        Assertions.assertTrue((long) library.items.size() > 0);
        Assertions.assertTrue(library.items.contains(newspaper));
    }
    // Test that items can be checked out
    @Test
    public void testCheckingOutBookWorks() {
        Library library = new Library();
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        String bookTitle = "Java: Just in Time";
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);

        Assertions.assertEquals("item has been checked out", library.checkOutItem(bookTitle));
    }

    @Test
    public void testCheckingOutArticleWorks() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);

        Assertions.assertEquals("item has been checked out", library.checkOutItem(articleTitle));
    }

    @Test
    public void testCheckingOutNewspaperDoesNotWork() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);

        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem(newspaperTitle));
    }

    // Test that items can be checked in
    @Test
    public void testCheckingInBookWorks() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        library.checkOutItem(bookTitle);

        Assertions.assertEquals("item has been checked in", library.checkInItem(bookTitle));
    }

    @Test
    public void testCheckingInArticleWorks() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        library.checkOutItem(articleTitle);

        Assertions.assertEquals("item has been checked in", library.checkInItem(articleTitle));
    }

    @Test
    public void testCheckingInNewspaperDoesNotWork() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        library.checkOutItem(newspaperTitle);

        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newspaperTitle));
    }

    // Test that items that aren't in the collection behave correctly
    @Test
    public void testCantCheckInMissingBook() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);

        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Some Python Book"));
    }

    @Test
    public void testCantCheckInMissingArticle() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);

        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Some Python Article"));
    }

    @Test
    public void testCantCheckInMissingNewspaper() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("The Daily Python"));
    }

    @Test
    public void testCantCheckOutMissingBook() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Some Python Book"));
    }

    @Test
    public void testCantCheckOutMissingArticle() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Some Python Article"));
    }

    @Test
    public void testCantCheckOutMissingNewspaper() {
        Library library = new Library();
        String bookTitle = "Java: Just in Time";
        Author bookAuthor = new Author("James Gosling", "james@gosling.com", "gosling.com", "0112233445");
        LibraryItem book = new Book(bookTitle, bookAuthor);
        library.addToStock(book);
        String articleTitle = "Java - New Adventures in Coding";
        Author articleAuthor = new Author("John Latham", "john@latham.com", "latham.com", "0161 343 4343");
        LibraryItem article = new Article(articleTitle, articleAuthor);
        library.addToStock(article);
        String newspaperTitle = "The Daily Java";
        LibraryItem newspaper = new Newspaper(newspaperTitle);
        library.addToStock(newspaper);
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("The Daily Python"));
    }
}
