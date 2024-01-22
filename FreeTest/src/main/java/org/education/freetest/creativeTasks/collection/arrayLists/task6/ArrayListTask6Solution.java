package org.education.freetest.creativeTasks.collection.arrayLists.task6;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTask6Solution {
    public HashMap<Integer, ArrayList<String>> groupingByLength(ArrayList<String> list){
        HashMap<Integer,ArrayList<String>> lengthAndWord = new HashMap<>();
        int key;
        for(String element:list){
            key = element.length();
            ArrayList<String> value = lengthAndWord.get(key);
            if (value == null){
                value = new ArrayList<>();
                value.add(element);
                lengthAndWord.put(key,value);
            }
            else {
                value.add(element);
                lengthAndWord.put(key,value);
            }
        }
        return lengthAndWord;
    }
}
