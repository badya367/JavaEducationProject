package org.education.freetest.creativeTasks.solidLibraryTest.library;

import org.education.freetest.creativeTasks.solidLibraryTest.book.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library implements BookRepository{
    private Map<String,Book> books = new HashMap<>();
    @Override
    public void addBook(Book book) {
        books.put(book.getId(),book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book.getId());
    }

    @Override
    public Book getBook(String idBook) {
        return books.get(idBook);
    }

    @Override
    public Collection<Book> getAllBook() {
        return books.values();
    }
}
