package org.education.freetest.creativeTasks.collection.arrayLists.task7;

import java.util.ArrayList;

public class ArrayListTask7Solution {
    public static double averageAge(ArrayList<Person> list){
        int sumAge = 0;
        int countPerson = list.size();
        if(countPerson!=0){
            for (Person person:list){
                sumAge += person.getAge();
            }
            return (double) sumAge/countPerson;
        }
        return 0;
    }
}
