package org.education.freetest.creativeTasks.collection.arrayLists.task5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask5Main {
    public static void main(String[] args) {
        ArrayList<Character> testArrayList = new ArrayList<>();
        Collections.addAll(testArrayList, 'A', 'O', 'B', 'G', 'K');
        System.out.println("ArrayList<String> содержит: " + testArrayList);
        ArrayListTask5Solution test = new ArrayListTask5Solution();
        test.reverseList(testArrayList);
        System.out.println("Результат: " + testArrayList);
    }
}
