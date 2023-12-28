package org.education.leetcode.arrays.introduction.task1;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int resultFunc;
        int previousMaxConsecutive = 0;
        int counterOnes = 0;
        for (int num : nums) {

            if (num == 1) {
                counterOnes++;
                if (counterOnes > previousMaxConsecutive) {
                    previousMaxConsecutive = counterOnes;
                }
            }
            else {
                counterOnes = 0;
            }
        }
        resultFunc = previousMaxConsecutive;
        return resultFunc;
    }
}