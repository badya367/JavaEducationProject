package org.education.freetest.creativeTasks.collection.arrayLists;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++){
            myArrayList.add(i, "0");
        }
        myArrayList.add("1");
        myArrayList.add("100");
        System.out.println(myArrayList);





    }
}
