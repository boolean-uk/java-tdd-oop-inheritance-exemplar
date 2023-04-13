package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }

    @Test
    public void settingAuthorNotAllowed() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Author author = new Author("Rupert Murdoch", "rupert@newsinternational.com", "newsinternational.com", "01666666");
        newspaper.setAuthor(author);
        Assertions.assertNull(newspaper.getAuthor());
    }
}
