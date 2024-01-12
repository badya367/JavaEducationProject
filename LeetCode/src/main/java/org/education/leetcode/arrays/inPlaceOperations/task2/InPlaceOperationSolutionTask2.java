package org.education.leetcode.arrays.inPlaceOperations.task2;

public class InPlaceOperationSolutionTask2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int element = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[element] = nums[i];
                element++;
            }
        }
        return element;
    }
}
