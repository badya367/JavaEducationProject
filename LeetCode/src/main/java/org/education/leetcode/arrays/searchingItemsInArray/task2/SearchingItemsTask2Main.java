package org.education.leetcode.arrays.searchingItemsInArray.task2;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class SearchingItemsTask2Main {
    public static void main(String[] args) {
//        int [] nums = {2,1}; // return false
//        int [] nums = {3,5,5}; // return false
//        int [] nums = {0,3,2,1}; // return true
//        int [] nums = {0,1,2,3,4,5,6,7,8,9}; // return false
        int [] nums = GeneratorArray.generateArrayRandomNumWithCustomValues(10,10);
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));
        SearchingItemsSolutionTask2 test = new SearchingItemsSolutionTask2();
        boolean result = test.validMountainArray(nums);
        System.out.println("Результат: " + result);
    }
}
