package org.education.freetest.creativeTasks;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.*;

public class ThirdMaxElementMain {
    public static void main(String[] args) {
        int[] testArray = GeneratorArray.generateArrayRandomNumWithCustomValues(10, 20);
        int[] testArray2 = GeneratorArray.generateArrayRandomNumWithCustomValues(10, 20);
        int[] testArray3 = GeneratorArray.generateArrayRandomNumWithCustomValues(10, 500);
        //int[] testArray = {96, 434, 80, 292, 301, 356, 254, 450, 267, 91};
        //int[] testArray = {6, 20, 19, 8, 18, 19, 1, 0, 10, 10};

        System.out.println("Сгенерированный массив для проверки через If: " + Arrays.toString(testArray));
        System.out.println("Результат: " + thirdMaxValueThroughIf(testArray));

        System.out.println("Сгенерированный массив для проверки через сортировку: " + Arrays.toString(testArray2));
        System.out.println("Результат: " + thirdMaxValueThroughSort(testArray2));

        NavigableSet<Integer> testTreeSet = new TreeSet<>();
        for (int element : testArray3){
            testTreeSet.add(element);
        }
        System.out.println("Сгенерированная коллекция: " + testTreeSet);
        System.out.println("Результат: " + thirdMaxValueThroughTreeSet(testTreeSet));
    }
    public static int thirdMaxValueThroughIf(int[] values) {
        int maxValues1 = 0;
        int maxValues2 = 0;
        int maxValues3 = 0;

        for (int value : values) {
            if (value > maxValues1) {
                if (maxValues1 != 0) {
                    maxValues3 = maxValues2;
                    maxValues2 = maxValues1;
                }
                maxValues1 = value;
            } else if (value > maxValues2 && value < maxValues1) {
                if (maxValues2 != 0) {
                    maxValues3 = maxValues2;
                }
                maxValues2 = value;
            } else if (value > maxValues3 && value < maxValues2) {
                maxValues3 = value;
            }
        }
        return maxValues3;
    }

    public static int thirdMaxValueThroughSort(int[] values){
        Arrays.sort(values);
        System.out.println("отсортированный массив: " + Arrays.toString(values));
        int maxValue1 = 0;
        int maxValue2 = 0;
        int maxValue3 = 0;
        for (int i = values.length-1; i > 0; i--) {
            if(values[i] > maxValue1) {
                maxValue1 = values[i];
            } else if (values[i] != maxValue1 && values[i] > maxValue2) {
                maxValue2 = values[i];
            } else if (values[i] != maxValue2 && values[i] != maxValue1 && values[i] > maxValue3) {
                maxValue3 = values[i];
            }
        }
        return maxValue3;
    }

    public static int thirdMaxValueThroughTreeSet(NavigableSet<Integer> treeSet){
        if (treeSet.size() > 3){
            treeSet.pollLast();
            treeSet.pollLast();
            return treeSet.last();
        }
        return 0;
    }
}
