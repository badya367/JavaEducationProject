package org.education.leetcode.arrays.introduction.task3;

import org.education.leetcode.myGenerators.array.GeneratorArray;


import java.util.Arrays;
/**
 * Класс для запуска задания №3 из главы Arrays.Introduction
 */
public class ArraysIntroductionTaskThreeMain {
    public static void main(String[] args) {
        int arrayCapacity = GeneratorArray.inputArrayCapacity();
        int[] testArray = GeneratorArray.generateArrayRandomNumWithNegative(arrayCapacity);
        System.out.println("Ваш массив для задания №3: " + Arrays.toString(testArray));
        IntroductionSolutionTask3 test = new IntroductionSolutionTask3();
        int[] testArrayResult = test.sortedSquares(testArray);
        System.out.println("Результат задания №3: " + Arrays.toString(testArrayResult) +
                "\nИзначальный массив возведённый в квадрат и отсортированный по возрастанию");
    }
}
