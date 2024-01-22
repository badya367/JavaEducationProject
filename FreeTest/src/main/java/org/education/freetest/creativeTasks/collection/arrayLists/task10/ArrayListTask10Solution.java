package org.education.freetest.creativeTasks.collection.arrayLists.task10;

import java.util.ArrayList;

public class ArrayListTask10Solution {
    public static ArrayList<String> combineSentence(ArrayList<ArrayList<String>> list){
        ArrayList<String> result = new ArrayList<>();
        for(ArrayList<String> element:list){
            if(!element.isEmpty()){
                result.addAll(element);
            }
        }
        return result;
    }
}
