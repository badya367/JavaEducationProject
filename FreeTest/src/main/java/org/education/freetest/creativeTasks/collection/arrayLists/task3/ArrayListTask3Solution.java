package org.education.freetest.creativeTasks.collection.arrayLists.task3;

import java.util.ArrayList;

public class ArrayListTask3Solution {
    public ArrayList<String> joinArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }
}
