package tinkoff.Task55;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        char[][] forest = new char[n][3];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                forest[i][j] = line.charAt(j);
            }
        }

        int maxMushrooms = getMaxMushrooms(forest);
        System.out.println(maxMushrooms);
    }


    private static int getMaxMushrooms(char[][] forest) {
        int maxMushrooms = 0;


        for (int startCol = 0; startCol < 3; startCol++) {
            if (forest[0][startCol] == 'W') continue;
            maxMushrooms = Math.max(maxMushrooms, findMaxMushrooms(forest, 0, startCol));
        }

        return maxMushrooms;
    }

    private static int findMaxMushrooms(char[][] forest, int row, int col) {
        if (row == forest.length - 1) { // если дошли до последней строки
            return (forest[row][col] == 'C') ? 1 : 0; // возвращаем 1, если в текущей клетке грибы, иначе 0
        }

        int[] dr = {1, 1, 1};
        int[] dc = {-1, 0, 1};

        int maxMushrooms = 0;

        for (int i = 0; i < 3; i++) {
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];

            if (nextRow < forest.length && nextCol >= 0 && nextCol < 3 && forest[nextRow][nextCol] != 'W') {
                maxMushrooms = Math.max(maxMushrooms, (forest[row][col] == 'C' ? 1 : 0) + findMaxMushrooms(forest, nextRow, nextCol));
            }
        }

        return maxMushrooms;
    }
}
