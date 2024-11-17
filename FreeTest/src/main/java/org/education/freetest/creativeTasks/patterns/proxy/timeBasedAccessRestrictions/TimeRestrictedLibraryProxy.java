package org.education.freetest.creativeTasks.patterns.proxy.timeBasedAccessRestrictions;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeRestrictedLibraryProxy implements IBookLibrary{
    BookLibrary bookLibrary;

    private BookLibrary getBookLibrary(){
        if (bookLibrary == null) {
            bookLibrary = new BookLibrary();
        }

        return bookLibrary;
    }

    @Override
    public void borrowBook(String bookTitle) {
        if(!isOpenLibrary()) {
            throw new LibraryClosedException("Библиотека закрыта");
        }
        getBookLibrary().borrowBook(bookTitle);
    }

    @Override
    public void returnBook(String bookTitle) {
        if(!isOpenLibrary()) {
            throw new RuntimeException(new LibraryClosedException("Библиотека закрыта"));
        }
        getBookLibrary().returnBook(bookTitle);
    }

    private boolean isOpenLibrary() {
        int hour = LocalTime.now().getHour();
        return hour >= 9 && hour < 18;
    }

    public void addBook(String bookTitle){
        getBookLibrary().addBook(bookTitle);
    }
}
