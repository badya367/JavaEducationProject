package org.education.freetest.creativeTasks.solidLibraryTest.book;

import lombok.Getter;

@Getter
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(String id, String title, String author, int year, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
