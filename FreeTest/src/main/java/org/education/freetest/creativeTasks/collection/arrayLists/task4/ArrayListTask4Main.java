package org.education.freetest.creativeTasks.collection.arrayLists.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask4Main {
    public static void main(String[] args) {
        ArrayList<Integer> testArrayList = new ArrayList<>();
        Collections.addAll(testArrayList,
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10),
                new Random().nextInt(10));
        System.out.println("ArrayList<Integer> содержит: " + testArrayList);
        ArrayListTask4Solution test = new ArrayListTask4Solution();
        int result = test.maxValueInList(testArrayList);
        System.out.println("Результат: " + result);
    }
}
