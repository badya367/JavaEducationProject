package org.education.freetest.creativeTasks.patterns.proxy.timeBasedAccessRestrictions;

import java.util.LinkedList;

public class BookLibrary implements IBookLibrary{
    private final LinkedList<String> freeBooks = new LinkedList<>();

    @Override
    public void borrowBook(String bookTitle) {
        if (freeBooks.contains(bookTitle)){
            freeBooks.remove(bookTitle);
            System.out.println("Книга: " + bookTitle + " выдана читателю");
        }
        else {
            throw new NullPointerException("Книга сейчас недоступна для прочтения");
        }
    }

    @Override
    public void returnBook(String bookTitle) {
        freeBooks.add(bookTitle);
        System.out.println("Читатель вернул книгу: " + bookTitle);
    }

    public void addBook(String bookTitle){
        freeBooks.add(bookTitle);
    }
}
