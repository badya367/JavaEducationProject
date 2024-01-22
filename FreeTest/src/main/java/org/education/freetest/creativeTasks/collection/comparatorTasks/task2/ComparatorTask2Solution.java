package org.education.freetest.creativeTasks.collection.comparatorTasks.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorTask2Solution implements Comparator<String> {
    private static final ComparatorTask2Solution listComparator = new ComparatorTask2Solution();
    public static void sortByLength(ArrayList<String> list){
        list.sort(listComparator);
    }
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
