package org.education.leetcode.myGenerators.array;

import org.education.leetcode.myGenerators.myExceptions.InvalidInputException;

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
     * @return возращает пустой массив заданной длины
     */
    public static int[] generateEmptyArray(int arrayCapacity) {
        return new int[arrayCapacity];
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
     * @return возращает массив заданной длины из натуральных чисел.
     */
    public static int[] generateArrayNaturalNum(int arrayCapacity) {
        int[] createdArray = new int[arrayCapacity];
        Random random = new Random();
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = random.nextInt(10);
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
    /**
     *
     * @param arrayCapacity - длина массива
     * @param maxValuesInArray - максимальное значение для значения элемента в массиве
     * @return возвращает массив из чисел в диапазоне [0:maxValuesInArray]
     */
    public static int[] generateArrayRandomNumWithCustomValues(int arrayCapacity, int maxValuesInArray) {
        int[] createdArray = new int[arrayCapacity];
        Random random = new Random();
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = random.nextInt(maxValuesInArray+1);
        }
        return createdArray;
    }
    /**
     *
     * @param arrayCapacity - длина массива
     * @param maxValuesInArray - максимальное значение для значения элемента в массиве
     * @return возвращает массив из чисел в диапазоне [-maxValuesInArray:maxValuesInArray]
     */
    public static int[] generateArrayRandomNumWithCustomValuesWithNegative(int arrayCapacity, int maxValuesInArray) {
        int[] createdArray = new int[arrayCapacity];
        Random random = new Random();
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = random.nextInt(maxValuesInArray+1) - maxValuesInArray/2;
        }
        return createdArray;
    }
    /**
     * @param array           - массив
     * @param quantityElement - количество элементов для заполнения
     *                        array[i] = [-10000:10000]
     */
    public static void fillingArray(int[] array, int quantityElement) throws InvalidInputException {
        if (quantityElement > array.length){
            throw new InvalidInputException("The quantityElement to insert is greater than the array.length");
        }
        Random random = new Random();
        for (int i = 0; i < quantityElement; i++){
            array[i] = random.nextInt(20001) - 10000;
        }
    }
}
