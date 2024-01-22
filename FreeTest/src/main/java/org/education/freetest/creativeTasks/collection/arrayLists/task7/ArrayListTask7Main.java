package org.education.freetest.creativeTasks.collection.arrayLists.task7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask7Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", new Random().nextInt(100)+1);
        Person person2 = new Person("Bob", new Random().nextInt(100)+1);
        Person person3 = new Person("Charlie", new Random().nextInt(100)+1);
        ArrayList<Person> personList = new ArrayList<>();
        Collections.addAll(personList,
                person1,
                person2,
                person3);
        System.out.println("Коллекция: " + personList);
        double averageAge = ArrayListTask7Solution.averageAge(personList);
        DecimalFormat formatAnswer = new DecimalFormat("#.##");
        System.out.println("Результат: " + formatAnswer.format(averageAge));
    }
}
