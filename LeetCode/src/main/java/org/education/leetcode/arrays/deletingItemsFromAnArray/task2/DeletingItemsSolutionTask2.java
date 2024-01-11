package org.education.leetcode.arrays.deletingItemsFromAnArray.task2;

import java.util.Arrays;

public class DeletingItemsSolutionTask2 {
    public int removeDuplicates(int[] nums) {
        int quantityElements = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    nums[j] = 101;
                }
            }
        }
        Arrays.sort(nums);
        for(int num:nums){
            if (num != 101){
                quantityElements++;
            }
        }
        return quantityElements;
    }
}
