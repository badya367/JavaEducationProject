package org.education.freetest.creativeTasks.patterns.proxy.timeBasedAccessRestrictions;

public interface IBookLibrary {
    void borrowBook(String bookTitle);
    void returnBook(String bookTitle);

    void addBook(String bookTitle);

}
