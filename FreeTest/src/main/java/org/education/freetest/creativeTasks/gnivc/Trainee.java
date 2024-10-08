package org.education.freetest.creativeTasks.gnivc;
import java.util.Arrays;

public class Trainee {

    public long[] solution(long[] array) {
        // На вход дан массив чисел. Необходимо вернуть массив четных положительных чисел из входящего массива.
        return Arrays.stream(array)
                .filter(x -> x > 0 && x % 2 == 0)
                .toArray();
    }

    public int[] solution(int[] arrayOne, int[] arrayTwo, int[] arrayThree) {
        // На вход поданы три отсортированных по убыванию массиива. Необходимо вернуть один массив,
        // в котором числа из трех входных массивов отсортированы по возрастанию
        int[] reversedArrayOne = reverse(arrayOne);
        int[] reversedArrayTwo = reverse(arrayTwo);
        int[] reversedArrayThree = reverse(arrayThree);

        return merge(reversedArrayOne, reversedArrayTwo, reversedArrayThree);
    }

    private int[] reverse(int[] array) {
        int n = array.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }
        return reversed;
    }

    private int[] merge(int[] arr1, int[] arr2, int[] arr3) {
        int[] mergedArray = new int[arr1.length + arr2.length + arr3.length];
        int i = 0, j = 0, k = 0, m = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) {
                mergedArray[m++] = arr1[i++];
            } else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) {
                mergedArray[m++] = arr2[j++];
            } else {
                mergedArray[m++] = arr3[k++];
            }
        }

        while (i < arr1.length && j < arr2.length) {
            mergedArray[m++] = (arr1[i] <= arr2[j]) ? arr1[i++] : arr2[j++];
        }

        while (i < arr1.length && k < arr3.length) {
            mergedArray[m++] = (arr1[i] <= arr3[k]) ? arr1[i++] : arr3[k++];
        }

        while (j < arr2.length && k < arr3.length) {
            mergedArray[m++] = (arr2[j] <= arr3[k]) ? arr2[j++] : arr3[k++];
        }

        while (i < arr1.length) {
            mergedArray[m++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[m++] = arr2[j++];
        }

        while (k < arr3.length) {
            mergedArray[m++] = arr3[k++];
        }

        return mergedArray;
    }
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        long[] testArray = {-1, -2, 2, -3, 4, -5, 6};
        long[] result = trainee.solution(testArray);
        System.out.println(Arrays.toString(result));

        int[] arrayOne = {9, 7, 5, 3, 1};
        int[] arrayTwo = {10, 8, 6, 4, 2};
        int[] arrayThree = {15, 12, 11};
        int[] result1 = trainee.solution(arrayOne, arrayTwo, arrayThree);
        System.out.println(Arrays.toString(result1));
    }
}

