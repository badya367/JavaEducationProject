package org.education.freetest.creativeTasks.solidLibraryTest.services.impl;

import org.education.freetest.creativeTasks.solidLibraryTest.models.Book;
import org.education.freetest.creativeTasks.solidLibraryTest.services.api.BookRepository;
import org.education.freetest.creativeTasks.solidLibraryTest.services.api.IBookManager;

public class BookManagerImpl implements IBookManager {
    BookRepository bookRepository;

    public BookManagerImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void addBook(Book book) {
        if(bookRepository.getBook(book.getId()) != null){
            throw new IllegalArgumentException("Book with ID already exist.");
        }
        bookRepository.addBook(book);
    }

    @Override
    public void removeBook(Book book) {
        if(bookRepository.getBook(book.getId()) == null){
            throw new IllegalArgumentException("No book found with this ID");
        }
        bookRepository.removeBook(book);
    }
}
