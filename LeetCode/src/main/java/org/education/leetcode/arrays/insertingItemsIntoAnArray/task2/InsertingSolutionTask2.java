package org.education.leetcode.arrays.insertingItemsIntoAnArray.task2;

import java.util.Arrays;

public class InsertingSolutionTask2 {
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
