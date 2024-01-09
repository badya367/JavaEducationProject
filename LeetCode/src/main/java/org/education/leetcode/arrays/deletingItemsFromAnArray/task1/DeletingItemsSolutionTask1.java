package org.education.leetcode.arrays.deletingItemsFromAnArray.task1;

public class DeletingItemsSolutionTask1 {
    public int removeElement(int[] nums, int val) {
        int quantityElements = nums.length;
        for (int i = nums.length-1; i>=0; i--){
            if(nums[i] == val){
                if (i == nums.length-1){
                    nums[i] = 0;
                }
                for (int j = i; j < nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                quantityElements--;
            }
        }
        for (int i = quantityElements; i < nums.length; i++){
            nums[i] = 0;
        }
        return quantityElements;
    }
}
