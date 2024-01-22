package org.education.freetest.creativeTasks.collection.arrayLists.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask3Main {
    public static void main(String[] args) {
        ArrayList<String> testArray1 = new ArrayList<>();
        Collections.addAll(testArray1, "Red", "Green", "Blue");
        System.out.println("Коллекция №1" + testArray1);
        ArrayList<String> testArray2 = new ArrayList<>();
        Collections.addAll(testArray2, "Yellow", "Purple", "Orange");
        System.out.println("Коллекция №2" + testArray1);
        ArrayListTask3Solution test = new ArrayListTask3Solution();
        ArrayList<String> result = new ArrayList<>(test.joinArrayLists(testArray1,testArray2));
        System.out.println("Результат: " + result);
    }
}
