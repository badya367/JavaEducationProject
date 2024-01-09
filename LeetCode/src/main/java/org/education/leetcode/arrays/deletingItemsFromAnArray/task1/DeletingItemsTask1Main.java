package org.education.leetcode.arrays.deletingItemsFromAnArray.task1;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;
import java.util.Random;

public class DeletingItemsTask1Main {
    public static void main(String[] args) {
        int [] nums = GeneratorArray.generateArrayRandomNumWithCustomValues(10,10);
        Random random = new Random();
        int k = random.nextInt(11);
        DeletingItemsSolutionTask1 test = new DeletingItemsSolutionTask1();
        System.out.println("Количество элементов в массиве: " + nums.length);
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.println("Удаляем элементы с значением: " + k);
        int result = test.removeElement(nums,k);
        System.out.println("Количество элементов в массиве: " + result);
        System.out.println("Результирующий массив: " + Arrays.toString(nums));
    }
}
