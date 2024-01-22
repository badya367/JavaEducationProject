package org.education.freetest.creativeTasks.collection.arrayLists.task10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask10Main {
    public static void main(String[] args) {
        ArrayList<String> test1 = new ArrayList<>();
        Collections.addAll(test1,
                "The", "quick", "brown");
        ArrayList<String> test2 = new ArrayList<>();
        Collections.addAll(test2,
                "fox", "jumps", "over");
        ArrayList<String> test3 = new ArrayList<>();
        Collections.addAll(test3,
                "the", "lazy", "dog");

        ArrayList<ArrayList<String>> testList = new ArrayList<>();
        Collections.addAll(testList,
                test1,
                test2,
                test3);
        System.out.println("Коллекция: " + testList);
        ArrayList<String> newTestList = ArrayListTask10Solution.combineSentence(testList);
        System.out.println("Результат: " + newTestList);
    }
}
