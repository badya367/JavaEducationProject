package org.education.leetcode.arrays.introduction.task1;

import java.util.Arrays;

public class ArraysIntroductionTaskOneMain {
    public static void main(String[] args) {
        int arrayCapacity = CreaterArray.inputArrayCapacity();
        int[] testArray = CreaterArray.generateArray(arrayCapacity);
        System.out.println("Ваш массив: " + Arrays.toString(testArray));
        Solution test = new Solution();
        int maxConsecutiveOnes = test.findMaxConsecutiveOnes(testArray);
        System.out.println("Результат: " + maxConsecutiveOnes);
    }


}
