package org.education.leetcode.arrays.inPlaceOperations.task5;

public class InPlaceOperationSolutionTask5 {
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
/*
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
 */