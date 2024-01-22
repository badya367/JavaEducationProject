package org.education.freetest.creativeTasks.collection.comparatorTasks.task2;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTask2Main {
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<>();
        Collections.addAll(testList,
                "Apple", "Banana", "Grapes", "Kiwi", "Orange");
        System.out.println("Коллекция: " + testList);
        ComparatorTask2Solution.sortByLength(testList);
        System.out.println("Результат:" + testList);
    }
}
