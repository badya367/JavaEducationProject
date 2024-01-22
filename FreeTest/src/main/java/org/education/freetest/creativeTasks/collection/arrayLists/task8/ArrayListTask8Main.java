package org.education.freetest.creativeTasks.collection.arrayLists.task8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask8Main {
    public static void main(String[] args) {
        ArrayList<String> testArray = new ArrayList<>();
        Collections.addAll(testArray,
                "Apple",
                "orange",
                "Banana",
                "Grapes",
                "kiwi",
                "pear",
                "Cherry");
        System.out.println("Входная коллекция: " + testArray);
        ArrayListTask8Solution.filter(testArray);
        System.out.println("Результат: " + testArray);
    }
}
