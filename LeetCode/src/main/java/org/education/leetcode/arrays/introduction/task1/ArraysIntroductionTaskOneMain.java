package org.education.leetcode.arrays.introduction.task1;

import org.education.leetcode.arrays.introduction.CreaterArray;

import java.util.Arrays;

/**
 * Класс для запуска задания №1 из главы Arrays.Introduction
 */
public class ArraysIntroductionTaskOneMain {
    public static void main(String[] args) {
        int arrayCapacity = CreaterArray.inputArrayCapacity();
        int[] testArray = CreaterArray.generateArrayOnesAndZero(arrayCapacity);
        System.out.println("Ваш массив для задания №1: " + Arrays.toString(testArray));
        Solution test = new Solution();
        int maxConsecutiveOnes = test.findMaxConsecutiveOnes(testArray);
        System.out.println("Результат задания №1: " + maxConsecutiveOnes +
                " единицы идущие друг за другом - это максимум");
    }


}
