package org.education.freetest.creativeTasks.collection.arrayLists.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ArrayListTask6Main {
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<>();
        Collections.addAll(testList,
                "Apple",
                "Orange",
                "Banana",
                "Grapes",
                "Kiwi",
                "Pear",
                "Cherry");
        System.out.println("Коллекция: " + testList);
        ArrayListTask6Solution test = new ArrayListTask6Solution();
        HashMap<Integer,ArrayList<String>> testMap = new HashMap<>(test.groupingByLength(testList));
        System.out.println("Результат" + testMap);
    }
}
