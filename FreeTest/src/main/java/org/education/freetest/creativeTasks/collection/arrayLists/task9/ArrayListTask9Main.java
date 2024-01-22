package org.education.freetest.creativeTasks.collection.arrayLists.task9;


import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;
import java.util.Random;

public class ArrayListTask9Main {
    public static void main(String[] args) {
        ArrayList<LocalDate> testList = new ArrayList<>();
        Collections.addAll(testList,
                LocalDate.of(new Random().nextInt(22)+2000,
                        new Random().nextInt(11)+1,
                        new Random().nextInt(27)+1),

                LocalDate.of(new Random().nextInt(22)+2000,
                        new Random().nextInt(11)+1,
                        new Random().nextInt(27)+1),

                LocalDate.of(new Random().nextInt(22)+2000,
                        new Random().nextInt(11)+1,
                        new Random().nextInt(27)+1),

                LocalDate.of(new Random().nextInt(22)+2000,
                        new Random().nextInt(11)+1,
                        new Random().nextInt(27)+1));
        System.out.println("Коллекция: " + testList);
        ArrayListTask9Solution test = new ArrayListTask9Solution();
        ArrayList<LocalDate> answer = test.temporaryDifference(testList);
        System.out.println("Результат: " + answer);
    }
}
