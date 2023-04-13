package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthorTest {
    @Test
    void testGetName() {
        Author author = new Author("JRR Tolkien", "jrr@tolkien.net", "tolkien.net", "01865 113791");

        Assertions.assertEquals("JRR Tolkien", author.getName());
    }

    @Test
    void testGetEmailAddress() {
        Author author = new Author("JRR Tolkien", "jrr@tolkien.net", "tolkien.net", "01865 113791");

        Assertions.assertEquals("jrr@tolkien.net", author.getEmailAddress());
    }

    @Test
    void testGetWebsite() {
        Author author = new Author("JRR Tolkien", "jrr@tolkien.net", "tolkien.net", "01865 113791");

        Assertions.assertEquals("tolkien.net", author.getWebsite());
    }

    @Test
    void testGetTelephoneNumber() {
        Author author = new Author("JRR Tolkien", "jrr@tolkien.net", "tolkien.net", "01865 113791");

        Assertions.assertEquals("01865 113791", author.getTelephoneNumber());
    }

    @Test
    void testGetDetails() {
        Author author = new Author("JRR Tolkien", "jrr@tolkien.net", "tolkien.net", "01865 113791");
        String expected = "Name: JRR Tolkien Email: jrr@tolkien.net Website: tolkien.net Tel No: 01865 113791";

        Assertions.assertEquals(expected, author.getDetails());
    }
}