package org.education.leetcode.arrays.introduction.task1;

/**
 * [Task1]
 * [верните максимальное количество 1 идущих друг за другом из массива]
 */
public class IntroductionSolutionTask1 {
    /**
     *
     * @param nums - сгенерированный массив состоящий из 1 и 0
     * @return resultFunc - максимальное число единиц из массива, идущих друг за другом
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int resultFunc;
        int previousMaxConsecutive = 0;
        int counterOnes = 0; //Счётчик единиц
        for (int num : nums) {
            /*
             Если элемент массива = 1 и если счётчик единиц больше чем предыдущее максимальное значение единиц
             то обновляем переменную previousMaxConsecutive, которая будет является результатом функции
             */
            if (num == 1) {
                counterOnes++;
                if (counterOnes > previousMaxConsecutive) {
                    previousMaxConsecutive = counterOnes;
                }
            }
            else {
                counterOnes = 0;
            }
        }
        resultFunc = previousMaxConsecutive;
        return resultFunc;
    }
}