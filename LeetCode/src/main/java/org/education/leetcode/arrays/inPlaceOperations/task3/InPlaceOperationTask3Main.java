package org.education.leetcode.arrays.inPlaceOperations.task3;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class InPlaceOperationTask3Main {
    public static void main(String[] args) {
        int[] nums = GeneratorArray.generateArrayRandomNumWithCustomValuesWithNegative(10,10);
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));
        InPlaceOperationSolutionTask3 test = new InPlaceOperationSolutionTask3();
        test.moveZeroes(nums);
        System.out.println("Результат: " + Arrays.toString(nums));
    }
}
