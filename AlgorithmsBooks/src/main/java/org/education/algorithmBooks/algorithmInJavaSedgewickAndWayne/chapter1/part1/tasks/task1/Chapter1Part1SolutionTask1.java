package org.education.algorithmBooks.algorithmInJavaSedgewickAndWayne.chapter1.part1.tasks.task1;

public class Chapter1Part1SolutionTask1 {
    public static int[] sortingThreeNumbers(int[] a) {
        if (a.length > 4) {
            System.out.println("По условию длина массива не должна быть длиннее 4");
            return a;
        }
        else {
            if (a[0] > a[1]) { a[3] = a[0]; a[0] = a[1]; a[1] = a[3]; }
            if (a[0] > a[2]) { a[3] = a[0]; a[0] = a[2]; a[2] = a[3]; }
            if (a[1] > a[2]) { a[3] = a[1]; a[1] = a[2]; a[2] = a[3]; }
            return new int[]{a[0], a[1], a[2]};
        }
    }
}
