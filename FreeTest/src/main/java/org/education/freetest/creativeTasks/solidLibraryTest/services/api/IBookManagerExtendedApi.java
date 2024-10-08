package org.education.freetest.creativeTasks.solidLibraryTest.services.api;

import org.education.freetest.creativeTasks.solidLibraryTest.models.Book;

import java.util.List;

public interface IBookManagerExtendedApi extends IBookManager{
    void addBooks(List<Book> books);
}
