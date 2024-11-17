package org.education.freetest.creativeTasks.patterns.proxy.timeBasedAccessRestrictions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        IBookLibrary bookLibrary = new TimeRestrictedLibraryProxy();
        bookLibrary.addBook("Лев Толстой «Война и мир»");
        bookLibrary.addBook("Джордж Оруэлл «1984»");
        bookLibrary.addBook("Джеймс Джойс «Улисс»");
        bookLibrary.addBook("Владимир Набоков «Лолита»");
        bookLibrary.addBook("Уильям Фолкнер «Звук и ярость»");
        bookLibrary.addBook("Ральф Эллисон «Человек-невидимка»");
        bookLibrary.addBook("Вирджиния Вулф «На маяк»");
        bookLibrary.addBook("Гомер «Илиада» и «Одиссея»");
        bookLibrary.addBook("Джейн Остен «Гордость и предубеждение»");
        bookLibrary.addBook("Данте Алигьери «Божественная комедия»");

        bookLibrary.borrowBook("Данте Алигьери «Божественная комедия»");
        //bookLibrary.borrowBook("Данте Алигьери «Божественная комедия»");
        bookLibrary.returnBook("Данте Алигьери «Божественная комедия»");
        bookLibrary.borrowBook("Данте Алигьери «Божественная комедия»");
    }
}

