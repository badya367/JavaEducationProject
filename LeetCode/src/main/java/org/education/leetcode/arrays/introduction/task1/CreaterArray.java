package org.education.leetcode.arrays.introduction.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreaterArray {
    public static int inputArrayCapacity() {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        try {
            result = scanner.nextInt();
        }
        catch (InputMismatchException ex) {
            System.out.println("вам необходимо указать целочисленное значение");
            return inputArrayCapacity();
        }
        return result;
    }
    public static int[] generateArray(int arrayCapacity) {
        int[] createdArray = new int[arrayCapacity];
        for (int i = 0; i < createdArray.length; i++ ) {
            createdArray[i] = (int) (Math.random() * 2);
        }
        return createdArray;
    }
}
