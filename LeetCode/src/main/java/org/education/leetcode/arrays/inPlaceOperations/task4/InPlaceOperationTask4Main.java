package org.education.leetcode.arrays.inPlaceOperations.task4;

import java.util.Arrays;

public class InPlaceOperationTask4Main {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        InPlaceOperationSolutionTask4 test = new InPlaceOperationSolutionTask4();
        int[] res = test.sortArrayByParity(nums);
        System.out.println("Результат: " + Arrays.toString(res));
    }
}
