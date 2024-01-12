package org.education.leetcode.arrays.searchingItemsInArray.task1;

public class SearchingItemsSolutionTask1 {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
