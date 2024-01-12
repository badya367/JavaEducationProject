package org.education.leetcode.arrays.searchingItemsInArray.task1;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class SearchingItemsTask1Main {
    public static void main(String[] args) {
        //int [] nums = {7,1,14,11};
        int [] nums = GeneratorArray.generateArrayRandomNumWithCustomValuesWithNegative(10,10);
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));
        SearchingItemsSolutionTask1 test = new SearchingItemsSolutionTask1();
        boolean result = test.checkIfExist(nums);
        System.out.println("Результат: " + result);
    }
}
