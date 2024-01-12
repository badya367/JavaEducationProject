package org.education.leetcode.arrays.inPlaceOperations.task1;

public class InPlaceOperationSolutionTask1 {
    public int[] replaceElements(int[] arr) {
        int indexMaxValue = searchingIndexMaxValue(arr,0);
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length-1) {
                arr[i] = -1;
                return arr;
            }

            if(arr[i] < arr[indexMaxValue]){
                arr[i] = arr[indexMaxValue];
            }
            else{
                indexMaxValue = searchingIndexMaxValue(arr,i);
                arr[i] = arr[indexMaxValue];
            }
        }
        return arr;
    }

    public int searchingIndexMaxValue(int[] arr, int elementIndexForStart) {
        int max = 0;
        int index = 0;
        for (int i = elementIndexForStart+1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
