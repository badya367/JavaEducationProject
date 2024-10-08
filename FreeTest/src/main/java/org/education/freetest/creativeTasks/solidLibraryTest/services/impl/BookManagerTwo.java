package org.education.freetest.creativeTasks.solidLibraryTest.services.impl;

import org.education.freetest.creativeTasks.solidLibraryTest.models.Book;
import org.education.freetest.creativeTasks.solidLibraryTest.services.api.BookRepository;
import org.education.freetest.creativeTasks.solidLibraryTest.services.api.IBookManagerExtendedApi;

import java.util.List;

public class BookManagerTwo extends BookManagerImpl implements IBookManagerExtendedApi {


    public BookManagerTwo(BookRepository bookRepository) {
        super(bookRepository);
    }

    public void addBooks(List<Book> books){
        for (Book book : books) {
            addBook(book);
        }
    }
}
