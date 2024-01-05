package org.education.algorithmBooks.algorithmInJavaSedgewickAndWayne.chapter1.part1.tasks.task1;

import org.education.leetcode.myGenerators.array.GeneratorArray;

import java.util.Arrays;

public class Chapter1Part1MainTask1 {
    public static void main(String[] args) {
        int[] testArray = GeneratorArray.generateArrayRandomNum(4);
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(testArray));
        int [] result = Chapter1Part1SolutionTask1.sortingThreeNumbers(testArray);
        System.out.println("Решение задачи 1.1.1: ");
        System.out.println(Arrays.toString(result));
    }
}
