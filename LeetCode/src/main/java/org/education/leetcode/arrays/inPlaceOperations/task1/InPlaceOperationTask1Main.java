package org.education.leetcode.arrays.inPlaceOperations.task1;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class InPlaceOperationTask1Main {
    public static void main(String[] args) {
        int [] nums = GeneratorArray.generateArrayRandomNumWithCustomValues(10,20);
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));
        InPlaceOperationSolutionTask1 test = new InPlaceOperationSolutionTask1();
        nums = test.replaceElements(nums);
        System.out.println("Результат: " + Arrays.toString(nums));
    }


}
