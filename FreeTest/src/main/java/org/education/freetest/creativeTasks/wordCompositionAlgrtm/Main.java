package org.education.freetest.creativeTasks.wordCompositionAlgrtm;

import services.DBMySqlImpl;
import services.DBService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection("jdbc:mysql://@localhost:3306/DB_forFreeTest?user=root&password=serverSQL367admin!");
//        System.out.println("Супер");
//        DBService test = new DBMySqlImpl();
//        test.connectionDB();
        
//        String userString = "сорда";

        DBMySqlImpl dbTable = new DBMySqlImpl();
        ArrayList<String> allStringFromDB = dbTable.getAllString();

        System.out.println("Введите строку для составления слов: ");
        String userString = InputUserString.inputString();

        System.out.println("Введённая строка: " + userString);
        System.out.println("Ищем всевозможные слова, которые можно составить из заданной строки...");

        algorithmForCompositionWord.startAlgrtm(userString, allStringFromDB);
    }
}
