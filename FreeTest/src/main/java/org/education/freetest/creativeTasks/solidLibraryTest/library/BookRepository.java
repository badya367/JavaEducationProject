package org.education.freetest.creativeTasks.solidLibraryTest.library;

import org.education.freetest.creativeTasks.solidLibraryTest.book.Book;

import java.util.Collection;

public interface BookRepository {
    void addBook(Book book);
    void removeBook(Book book);
    Book getBook(String idBook);
    Collection<Book> getAllBook();
}
