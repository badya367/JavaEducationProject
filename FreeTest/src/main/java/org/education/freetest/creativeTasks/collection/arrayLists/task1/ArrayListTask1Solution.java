package org.education.freetest.creativeTasks.collection.arrayLists.task1;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTask1Solution {
    public void sortArrayList(ArrayList<String> arrayList) {
        //Collections.sort(arrayList);
        arrayList.sort(Comparator.naturalOrder());

    }


}
