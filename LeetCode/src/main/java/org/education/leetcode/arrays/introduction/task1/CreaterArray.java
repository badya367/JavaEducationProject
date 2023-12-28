package org.education.leetcode.arrays.introduction.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreaterArray {
    public static int inputArrayCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введеите длину массива: ");
        try {
            return scanner.nextInt();
        }
        catch (InputMismatchException ex) {
            System.out.println("вам необходимо указать целочисленное значение");
            inputArrayCapacity();
        }
        return 0;
    }
    public static int[] generateArray(int arrayCapacity) {
        int[] createdArray = new int[arrayCapacity];
        for (int i = 0; i < createdArray.length; i++ ) {
            createdArray[i] = (int) (Math.random() * 2);
        }
        return createdArray;
    }
}
