package org.education.leetcode.arrays.inPlaceOperations.task3;

public class InPlaceOperationSolutionTask3 {
    public void moveZeroes(int[] nums) {
        int counter = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 0){
                int step = i;
                while (step != counter){
                    nums[step] = nums[step+1];
                    nums[step+1] = 0;
                    step++;
                }
                counter--;

            }
        }
    }
}
/*
        int index = 0;
        for (int n : nums) {
            if (n != 0) nums[index++] = n;
        }

        while (index < nums.length) nums[index++] = 0;
or
        int writer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[writer];
                nums[writer] = temp;
                writer++;
            }
        }
 */