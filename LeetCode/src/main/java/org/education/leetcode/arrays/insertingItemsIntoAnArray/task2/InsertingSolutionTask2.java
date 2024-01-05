package org.education.leetcode.arrays.insertingItemsIntoAnArray.task2;

import java.util.Arrays;

public class InsertingSolutionTask2 {
    /**
     *
     * @param nums1 - сгенерированный массив состоящий из чисел диапазона [-10000:10000]
     * @param nums2 - сгенерированный массив состоящий из чисел диапазона [-10000:10000]
     * @param m - количество заполненных элементов в массиве nums1
     * @param n - количество заполненных элементов в массиве nums2
     *
     * Функция добавляет в конец массива nums1 все элементы из nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i < nums1.length; i++){
            if (n!= 0) {
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}
