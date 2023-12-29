package org.education.leetcode.arrays.introduction.task2;

import org.education.leetcode.arrays.introduction.CreaterArray;


import java.util.Arrays;
/**
 * Класс для запуска задания №2 из главы Arrays.Introduction
 */
public class ArraysIntroductionTaskTwoMain {
    public static void main(String[] args) {
        int arrayCapacity = CreaterArray.inputArrayCapacity();
        int[] testArray = CreaterArray.generateArrayRandomNum(arrayCapacity);
        System.out.println("Ваш массив для задания №2: " + Arrays.toString(testArray));
        Solution test = new Solution();
        int numberWithEvenLength = test.findNumbers(testArray);
        System.out.println("Результат задания №2:" + numberWithEvenLength + " - количество чисел с четной длиной");
    }
}
