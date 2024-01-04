package org.education.leetcode.arrays.introduction;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
/**
 * Класс генератор различных массивов
 */
public class GeneratorArray {
    /**
     * @return возращает число введённое пользователем, которое будет задавать длину массива
     */
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

    /**
     *
     * @param arrayCapacity - длина массива
     * @return возвращает массив нужной длины состоящий из 1 и 0
     */
    public static int[] generateArrayOnesAndZero(int arrayCapacity) {
        int[] createdArray = new int[arrayCapacity];
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int) (Math.random() * 2);
        }
        return createdArray;
    }

    /**
     *
     * @param arrayCapacity - длина массива
     * @return возращает массив из положительных чисел. Максимально сгенерированное число 100000
     */
    public static int[] generateArrayRandomNum(int arrayCapacity) {
        int[] createdArray = new int[arrayCapacity];
        Random random = new Random();
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = random.nextInt(100001);
        }
        return createdArray;
    }

    /**
     *
     * @param arrayCapacity - длина массива
     * @return возвращает массив из чисел в диапазоне [-10000:10000]
     */
    public static int[] generateArrayRandomNumWithNegative(int arrayCapacity) {
        int[] createdArray = new int[arrayCapacity];
        Random random = new Random();
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = random.nextInt(20001) - 10000;
        }
        return createdArray;
    }
}
