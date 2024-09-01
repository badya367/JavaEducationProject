package org.education.freetest.creativeTasks.solidLibraryTest.book;

import org.education.freetest.creativeTasks.solidLibraryTest.library.BookRepository;

public class BookManagerImpl implements IBookManager{
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
