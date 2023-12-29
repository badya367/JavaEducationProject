package org.education.leetcode.arrays.introduction.task2;

/**
 * [Task2]
 * [Верните количество чисел с четным количеством цифр]
 */
public class Solution {
    /**
     * @param nums - сгенерированный массив состоящий из положительных чисел (максимальное число - 100000)
     * @return resultFunc - количество чисел с четным количеством цифр
     */
    public int findNumbers(int[] nums){
        int resultFunc = 0;
        for (int num : nums) {
            int howManyCharacter = 0;
            /*
                Пока число не равно 0, делим его на 10
                Количество делений = количеству цифр в числе
             */
            do {
                howManyCharacter++;
                num /= 10;
            } while (num != 0);
            // Если остаток от деления равен 0, то в числе четное количество цифр
            if (howManyCharacter%2 == 0) {
                resultFunc++;
            }
        }
        return resultFunc;
    }
}
