package tinkoff.Task555;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] grid = new String[n];
        for (int i = 0; i < n; i++) {
            grid[i] = scanner.nextLine();
        }

        int[][] dp = new int[n][3];

        for (int j = 0; j < 3; j++) {
            if (grid[n - 1].charAt(j) == 'C') {
                dp[n - 1][j] = 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                if (grid[i].charAt(j) == 'W') {
                    continue;
                }

                for (int k = j - 1; k <= j + 1; k++) {
                    if (k >= 0 && k < 3 && grid[i + 1].charAt(k) != 'W') {
                        int hasMushroom = 0;
                        if (grid[i].charAt(j) == 'C') {
                            hasMushroom = 1;
                        }
                        dp[i][j] = Math.max(dp[i][j], dp[i + 1][k] + hasMushroom);
                    }
                }
            }
        }

        int maxMushrooms = 0;
        for (int j = 0; j < 3; j++) {
            maxMushrooms = Math.max(maxMushrooms, dp[0][j]);
        }

        System.out.println(maxMushrooms);
    }
}