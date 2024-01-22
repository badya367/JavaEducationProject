package org.education.freetest.creativeTasks.collection.arrayLists.task8;



import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask8Solution {
    public static void filter(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            char[] elementAsArray = element.toCharArray();
            if(!Character.isUpperCase(elementAsArray[0])){
                iterator.remove();
            }
        }
    }
}
