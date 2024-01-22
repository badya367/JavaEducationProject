package org.education.freetest.creativeTasks.collection.arrayLists.task2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask2Main {
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
        ArrayListTask2Solution test = new ArrayListTask2Solution();
        int result = test.uniqElementInArrayList(testArrayList);
        System.out.println("Результат: " + result);
    }
}
