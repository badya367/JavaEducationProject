package tinkoff.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }
        // Замеряем время начала выполнения
        long startTime = System.currentTimeMillis();

        int maxFives = findMaxFives(grades);
        System.out.println(maxFives);

        // Замеряем время окончания выполнения
        long endTime = System.currentTimeMillis();
        // Вычисляем время выполнения в миллисекундах
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения: " + executionTime + " мс");
    }

    private static int findMaxFives(int[] grades) {
        int maxFives = -1;
        for (int i = 0; i <= grades.length - 7; i++) {
            if (grades[i] != 2 && grades[i] != 3) {
                int countFives = 0;
                boolean validSequence = true;
                for (int j = i; j < i + 7; j++) {
                    if (grades[j] == 2 || grades[j] == 3) {
                        validSequence = false;
                        break;
                    }
                    if (grades[j] == 5) {
                        countFives++;
                    }
                }
                if (validSequence && countFives > maxFives) {
                    maxFives = countFives;
                }
            }
        }
        return maxFives;
    }
}

