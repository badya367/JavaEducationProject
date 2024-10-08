package tinkoff.Task6;

import java.util.*;


public class Main {
    static class Point {
        int x;
        int y;
        int steps;
        boolean isKing;

        Point(int x, int y, int steps, boolean isKing) {
            this.x = x;
            this.y = y;
            this.steps = steps;
            this.isKing = isKing;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] board = new char[n][n];

        int startX = 0, startY = 0, endX = 0, endY = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (board[i][j] == 'F') {
                    endX = i;
                    endY = j;
                }
            }
        }

        System.out.println(minimumMoves(board, startX, startY, endX, endY));
    }

    public static int minimumMoves(char[][] board, int startX, int startY, int endX, int endY) {
        int[][] directions = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
        Queue<Point> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[board.length][board[0].length][2];
        queue.offer(new Point(startX, startY, 0, false));
        visited[startX][startY][0] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == endX && current.y == endY) {
                return current.steps;
            }

            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];
                int newSteps = current.steps + 1;
                boolean newIsKing = current.isKing;

                if (isValidMove(newX, newY, board.length) && !visited[newX][newY][0]) {
                    if (board[newX][newY] == 'G') {
                        newIsKing = true;
                    } else if (board[newX][newY] == 'K') {
                        newIsKing = false;
                    }

                    if ((newIsKing || board[newX][newY] != 'K') && !visited[newX][newY][1]) {
                        queue.offer(new Point(newX, newY, newSteps, newIsKing));
                        visited[newX][newY][newIsKing ? 1 : 0] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static boolean isValidMove(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}
