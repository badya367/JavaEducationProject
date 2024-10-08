package org.education.freetest.creativeTasks.solidLibraryTest.models;

import lombok.Data;
import lombok.Getter;

@Data
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private String genre;
    private String location;

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
