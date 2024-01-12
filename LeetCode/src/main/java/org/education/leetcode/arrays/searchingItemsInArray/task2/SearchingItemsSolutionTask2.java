package org.education.leetcode.arrays.searchingItemsInArray.task2;

public class SearchingItemsSolutionTask2 {
    public boolean validMountainArray(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        if (arr.length < 3) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
        }

        if (indexMax == 0 || indexMax == arr.length-1) return false;

        for(int i = 1; i < indexMax; i++){
            if (arr[i-1] >= arr[i] || arr[i] >= arr[i+1]) return false;
        }

        for (int i = indexMax+1; i <= arr.length-1; i++) {
            while (i != arr.length-1) {
                if (arr[i-1] <= arr[i] || arr[i] <= arr[i+1]) return false;
                i++;
            }
            if (arr[i-1] <= arr[i]) return false;
        }

        return true;
    }
}
