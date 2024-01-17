package org.education.leetcode.arrays.inPlaceOperations.task4;

public class InPlaceOperationSolutionTask4 {
    public int[] sortArrayByParity(int[] nums) {
        int counter = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] % 2 == 0){
                int changeNum = nums[i];
                while (counter < i){
                    if (nums[counter] % 2 != 0){
                        nums[i] = nums[counter];
                        nums[counter] = changeNum;
                        counter++;
                        break;
                    }
                    counter++;
                }
            }
        }
        return nums;
    }
}
