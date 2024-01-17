package org.education.leetcode.arrays.inPlaceOperations.task4;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class InPlaceOperationTask4Main {
    public static void main(String[] args) {
        int[] nums = GeneratorArray.generateArrayRandomNumWithCustomValues(10,20);
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));
        InPlaceOperationSolutionTask4 test = new InPlaceOperationSolutionTask4();
        nums = test.sortArrayByParity(nums);
        System.out.println("Результат: " + Arrays.toString(nums));
    }
}
