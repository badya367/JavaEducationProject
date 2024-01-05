package org.education.algorithmBooks.algorithmInJavaSedgewickAndWayne.chapter1.part1.tasks.task2;

public class Chapter1Part1MainTask2 {
    public static void main(String[] args) {
        double resutlFunc = Chapter1Part1SolutionTask2.binomial(5,2,1);
        System.out.println("Количество вызовов функции binomial = " + Chapter1Part1SolutionTask2.getCounterFuncStart());
        System.out.println("Результат: " + resutlFunc);
    }
}
