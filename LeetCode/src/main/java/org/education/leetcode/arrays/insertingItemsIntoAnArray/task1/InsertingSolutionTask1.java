package org.education.leetcode.arrays.insertingItemsIntoAnArray.task1;

public class InsertingSolutionTask1 {
    /**
     *
     * @param arr - сгенерированный массив состоящий из натуральных цифр
     * функция дублирует 0 и свдигает остальные элементы вправо, не меняя длины массива
     */
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length-2; j >= i+1; j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
