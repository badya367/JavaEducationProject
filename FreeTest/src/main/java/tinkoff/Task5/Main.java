package tinkoff.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // считываем перевод строки после числа n

        char[][] forest = new char[n][3]; // создаем массив для представления леса

        // заполняем массив леса
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                forest[i][j] = line.charAt(j);
            }
        }

        int maxMushrooms = getMaxMushrooms(forest);
        System.out.println(maxMushrooms);
    }

    // метод для подсчета максимального количества грибов
    private static int getMaxMushrooms(char[][] forest) {
        int n = forest.length;
        int[][] dp = new int[n][3]; // массив для динамического программирования

        // заполняем базовый случай для нижней строки леса
        for (int j = 0; j < 3; j++) {
            if (forest[n - 1][j] == 'C') {
                dp[n - 1][j] = 1;
            }
        }

        // заполняем остальные ячейки массива dp
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                if (forest[i][j] == 'W') { // если в клетке кусты, пропускаем
                    continue;
                }
                int maxMushrooms = 0;
                for (int k = -1; k <= 1; k++) {
                    int col = j + k;
                    if (col >= 0 && col < 3) {
                        maxMushrooms = Math.max(maxMushrooms, dp[i + 1][col] + (forest[i][col] == 'C' ? 1 : 0));
                    }
                }
                dp[i][j] = maxMushrooms;
            }
        }

        // находим максимальное количество грибов в верхней строке леса
        int maxMushrooms = 0;
        for (int j = 0; j < 3; j++) {
            maxMushrooms = Math.max(maxMushrooms, dp[0][j]);
        }

        return maxMushrooms;
    }
}