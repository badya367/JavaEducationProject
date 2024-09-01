package org.education.freetest.creativeTasks.solidLibraryTest;


import org.education.freetest.creativeTasks.solidLibraryTest.book.Book;
import org.education.freetest.creativeTasks.solidLibraryTest.book.BookManagerImpl;
import org.education.freetest.creativeTasks.solidLibraryTest.book.IBookManager;
import org.education.freetest.creativeTasks.solidLibraryTest.library.BookRepository;
import org.education.freetest.creativeTasks.solidLibraryTest.library.Library;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("|SOLID Library Test Project|");
        System.out.println("----------------------------");
        // Создаем библиотеку, которая реализует BookRepository
        BookRepository library = new Library();

        // Создаем BookManagerImpl и передаем ему BookRepository
        IBookManager bookManager = new BookManagerImpl(library);

        // Создаем книги
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        Book book2 = new Book("2", "To Kill a Mockingbird", "Harper Lee", 1960, "Novel");

        try {
            // Добавляем книги через BookManager
            bookManager.addBook(book1);
            bookManager.addBook(book2);
            Collection<Book> allBook = library.getAllBook();
            for (Book book:allBook){
                System.out.println(book);
            }
            System.out.println("---------------");
            // Пытаемся добавить книгу с тем же ID, чтобы проверить обработку ошибок
            bookManager.addBook(book1); // Это вызовет исключение

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Получаем и отображаем книгу
        Book retrievedBook = library.getBook("1");
        System.out.println("Retrieved Book: " + retrievedBook.getTitle());

        try {
            // Удаляем книгу через BookManager
            bookManager.removeBook(book1);

            // Пытаемся удалить книгу снова, чтобы проверить обработку ошибок
            bookManager.removeBook(book1); // Это вызовет исключение
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Проверяем удаление книги
        System.out.println("Book with ID 1: " + library.getBook("1")); // Должно напечатать null или вызвать исключение
    }
}
