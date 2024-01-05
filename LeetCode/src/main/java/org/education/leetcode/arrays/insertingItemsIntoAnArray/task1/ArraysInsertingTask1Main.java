package org.education.leetcode.arrays.insertingItemsIntoAnArray.task1;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class ArraysInsertingTask1Main {
    public static void main(String[] args) {
        int arrayCapacity = GeneratorArray.inputArrayCapacity();
        int[] testArray = GeneratorArray.generateArrayNaturalNum(arrayCapacity);
        System.out.println("Ваш массив для задания №1: " + Arrays.toString(testArray));
        InsertingSolutionTask1 test = new InsertingSolutionTask1();
        test.duplicateZeros(testArray);
        System.out.println("Результат выполнения задания №1: " + Arrays.toString(testArray));
    }
}
