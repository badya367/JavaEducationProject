package org.education.freetest.creativeTasks.collection.arrayLists.task9;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListTask9Solution {
    public ArrayList<LocalDate> temporaryDifference(ArrayList<LocalDate> list) {
        ArrayList<LocalDate> answer = new ArrayList<>();
        LocalDate minDate = list.get(0);
        LocalDate maxDate = list.get(0);

        for(LocalDate element:list){
            if(element.isBefore(minDate)){
                minDate = element;
            }
            if(element.isAfter(maxDate)){
                maxDate = element;
            }
        }
        answer.add(minDate);
        answer.add(maxDate);
        return answer;
    }
}
/*
        if(!list.isEmpty()){
            ArrayList<LocalDate> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);
            answer.add(sortedList.get(0));
            answer.add(sortedList.get(sortedList.size()-1));
        }
 */