package org.education.leetcode.arrays.introduction.task2;

import org.education.leetcode.arrays.introduction.GeneratorArray;


import java.util.Arrays;
/**
 * Класс для запуска задания №2 из главы Arrays.Introduction
 */
public class ArraysIntroductionTaskTwoMain {
    public static void main(String[] args) {
        int arrayCapacity = GeneratorArray.inputArrayCapacity();
        int[] testArray = GeneratorArray.generateArrayRandomNum(arrayCapacity);
        System.out.println("Ваш массив для задания №2: " + Arrays.toString(testArray));
        IntroductionSolutionTask2 test = new IntroductionSolutionTask2();
        int numberWithEvenLength = test.findNumbers(testArray);
        System.out.println("Результат задания №2:" + numberWithEvenLength + " - количество чисел с четной длиной");
    }
}
