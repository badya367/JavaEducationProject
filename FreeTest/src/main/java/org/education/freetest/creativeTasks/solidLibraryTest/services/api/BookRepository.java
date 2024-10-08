package org.education.freetest.creativeTasks.solidLibraryTest.services.api;

import org.education.freetest.creativeTasks.solidLibraryTest.models.Book;

import java.util.Collection;

public interface BookRepository {
    void addBook(Book book);
    void removeBook(Book book);
    Book getBook(String idBook);
    Collection<Book> getAllBook();
}
