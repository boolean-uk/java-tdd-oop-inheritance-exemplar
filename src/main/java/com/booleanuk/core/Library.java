package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addToStock(LibraryItem item) {
        this.items.add(item);
    }

    public String checkInItem(String title) {
        for (LibraryItem item : this.items) {
            if (item.getTitle().equals(title)) {
                return item.checkIn();
            }
        }
        return "item is not part of the library's collection";
    }

    public String checkOutItem(String title) {
        for (LibraryItem item : this.items) {
            if (item.getTitle().equals(title)) {
                return item.checkOut();
            }
        }
        return "item is not part of the library's collection";
    }
}
