package org.education.algorithmBooks.algorithmInJavaSedgewickAndWayne.chapter1.part1.tasks.task2;

public class Chapter1Part1SolutionTask2 {
    private static int counterFuncStart = 0;
    public static double binomial(int N, int k, double p)
    {
        counterFuncStart++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

    public static int getCounterFuncStart() {
        return counterFuncStart;
    }
}
