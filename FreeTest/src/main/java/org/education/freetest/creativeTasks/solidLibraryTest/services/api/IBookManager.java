package org.education.freetest.creativeTasks.solidLibraryTest.services.api;

import org.education.freetest.creativeTasks.solidLibraryTest.models.Book;

public interface IBookManager {
    void addBook(Book book);
    void removeBook(Book book);
}
