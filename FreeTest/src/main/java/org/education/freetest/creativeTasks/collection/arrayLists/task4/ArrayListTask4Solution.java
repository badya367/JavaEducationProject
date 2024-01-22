package org.education.freetest.creativeTasks.collection.arrayLists.task4;

import java.util.ArrayList;

public class ArrayListTask4Solution {
    public int maxValueInList(ArrayList<Integer> list){
        int maxValue = 0;
        if (list.isEmpty()) return maxValue;
        for(int element:list){
            if(element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }
}
