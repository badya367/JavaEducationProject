package org.education.freetest.creativeTasks.solidLibraryTest.user;

import lombok.Getter;
import org.education.freetest.creativeTasks.solidLibraryTest.book.Book;

import java.util.ArrayList;
import java.util.List;
@Getter
public class User {
    private String id;
    private String username;
    private List<Book> borrowedBook;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
        this.borrowedBook = new ArrayList<>();
    }


}
