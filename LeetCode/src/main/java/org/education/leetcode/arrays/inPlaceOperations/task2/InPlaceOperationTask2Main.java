package org.education.leetcode.arrays.inPlaceOperations.task2;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class InPlaceOperationTask2Main {
    public static void main(String[] args) {
        int [] nums = GeneratorArray.generateArrayRandomNumWithCustomValues(10,10);
        Arrays.sort(nums);
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));
        InPlaceOperationSolutionTask2 test = new InPlaceOperationSolutionTask2();
        int result = test.removeDuplicates(nums);
        System.out.println("Результат: " + result);
        System.out.println("Итоговый массив: " + Arrays.toString(nums));
    }
}
