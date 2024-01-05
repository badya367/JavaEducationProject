package org.education.leetcode.arrays.insertingItemsIntoAnArray.task2;

import org.education.leetcode.myGenerators.array.GeneratorArray;
import org.education.leetcode.myGenerators.myExceptions.InvalidInputException;

import java.util.Arrays;
/**
 * Класс для запуска задания №2 из главы Arrays.insertingItemsIntoAnArray
 */
public class ArraysInsertingTask2Main {
    public static void main(String[] args) {
        System.out.println("Массив №2");
        int arrayCapacitySecond = GeneratorArray.inputArrayCapacity();
        System.out.println("Массив №1");
        int arrayCapacityFirst = GeneratorArray.inputArrayCapacity();
        int[] arrayFirst = GeneratorArray.generateEmptyArray(arrayCapacityFirst + arrayCapacitySecond);
        int[] arraySecond = GeneratorArray.generateEmptyArray(arrayCapacitySecond);
        try {
            GeneratorArray.fillingArray(arrayFirst,arrayCapacityFirst);
            GeneratorArray.fillingArray(arraySecond,arrayCapacitySecond);

        }
        catch (InvalidInputException ex){
            System.out.println(ex.getMessage());
            return;
        }
        System.out.println("Ваш массив №1" + Arrays.toString(arrayFirst));
        System.out.println("Ваш массив №2" + Arrays.toString(arraySecond));
        InsertingSolutionTask2 test = new InsertingSolutionTask2();
        test.merge(arrayFirst,arrayCapacityFirst,arraySecond,arrayCapacitySecond);
        System.out.println("Результат задания №2: " + Arrays.toString(arrayFirst));
    }
}
