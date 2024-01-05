package org.education.leetcode.arrays.introduction.task1;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

/**
 * Класс для запуска задания №1 из главы Arrays.Introduction
 */
public class ArraysIntroductionTaskOneMain {
    public static void main(String[] args) {
        int arrayCapacity = GeneratorArray.inputArrayCapacity();
        int[] testArray = GeneratorArray.generateArrayOnesAndZero(arrayCapacity);
        System.out.println("Ваш массив для задания №1: " + Arrays.toString(testArray));
        IntroductionSolutionTask1 test = new IntroductionSolutionTask1();
        int maxConsecutiveOnes = test.findMaxConsecutiveOnes(testArray);
        System.out.println("Результат задания №1: " + maxConsecutiveOnes +
                " единицы идущие друг за другом - это максимум");
    }


}
