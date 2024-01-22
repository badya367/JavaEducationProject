package org.education.freetest.creativeTasks.collection.comparatorTasks.task1;

import java.util.ArrayList;

public class ComparatorTask1Solution {
    public static void sortByAge(ArrayList<Person> list){
        PersonAgeComparator ageComparator = new PersonAgeComparator();
        list.sort(ageComparator);
    }
}
