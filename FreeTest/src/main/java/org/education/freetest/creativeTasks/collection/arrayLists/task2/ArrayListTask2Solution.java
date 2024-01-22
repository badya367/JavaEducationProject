package org.education.freetest.creativeTasks.collection.arrayLists.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTask2Solution {
    public int uniqElementInArrayList(ArrayList<Integer> arrayList){
        ArrayList<Integer> calculateList = new ArrayList<>(arrayList);
        calculateList.sort(Comparator.naturalOrder());
        int counterUniqElement = calculateList.size();

        for (int i = 0; i < calculateList.size(); i++) {
            int iValue = calculateList.indexOf(calculateList.get(i));
            for (int j = iValue+1; j < calculateList.size(); j++) {
                if(calculateList.get(i).equals(calculateList.get(j))){
                    counterUniqElement--;
                    i++;
                }
            }
        }
        return counterUniqElement;
    }
}
