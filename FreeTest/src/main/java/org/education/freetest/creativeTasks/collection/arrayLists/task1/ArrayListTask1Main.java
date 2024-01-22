package org.education.freetest.creativeTasks.collection.arrayLists.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask1Main {
    public static void main(String[] args) {
        ArrayList<String> testArrayList = new ArrayList<>();
        Collections.addAll(testArrayList, "Apple", "Orange", "Banana", "Grapes", "Kiwi");
        System.out.println("ArrayList<String> содержит: " + testArrayList);
        ArrayListTask1Solution test = new ArrayListTask1Solution();
        test.sortArrayList(testArrayList);
        System.out.println("Результат: " + testArrayList);
    }
}
