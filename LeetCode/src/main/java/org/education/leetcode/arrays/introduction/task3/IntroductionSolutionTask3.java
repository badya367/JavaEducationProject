package org.education.leetcode.arrays.introduction.task3;

import java.util.Arrays;

/**
 * [Task3]
 * [верните массив квадратов каждого числа из изначального массива, отсортированный в порядке возрастания.
 */
public class IntroductionSolutionTask3 {
    /**
     *
     * @param nums - сгенерированный массив состоящий из чисел в диапазоне [-10000:10000]
     * @return []sortedNums - отсортиванный в порядке возрастания массив из чисел возведённых в квадрат
     */
    public int[] sortedSquares(int[] nums) {
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int squaresNum = nums[i] * nums[i];
            sortedNums[i] = squaresNum;
        }
        Arrays.sort(sortedNums);
        return sortedNums;
    }
}
