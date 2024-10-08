package tinkoff.Task666;

import java.util.*;

class Main {
    static int[][] directionsKnight = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
    static int[][] directionsKing = {{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}};

    public static int bfs(char[][] board, int n, int[] start, int[] end) {
        Queue<int[]> queue = new LinkedList<>();
        HashMap<Character, HashSet<String>> visited = new HashMap<>();
        int dist = 0;

        queue.offer(start);
        visited.put('K', new HashSet<>());
        visited.get('K').add(Arrays.toString(start));

        while (!queue.isEmpty()) {
            dist++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int cur_i = pos[0], cur_j = pos[1];
                char state = board[cur_i][cur_j];
                int[][] directions = (state == 'K') ? directionsKnight : directionsKing;
                for (int[] dir : directions) {
                    int new_i = cur_i + dir[0], new_j = cur_j + dir[1];
                    if (new_i < 0 || new_i >= n || new_j < 0 || new_j >= n || visited.getOrDefault(state, new HashSet<>()).contains(Arrays.toString(new int[]{new_i, new_j}))) {
                        continue;
                    }
                    if (new_i == end[0] && new_j == end[1]) {
                        return dist;
                    } else if (board[new_i][new_j] != '.' && board[new_i][new_j] != 'S') {
                        queue.offer(new int[]{new_i, new_j});
                        visited.computeIfAbsent(board[new_i][new_j], k -> new HashSet<>()).add(Arrays.toString(new int[]{new_i, new_j}));
                    } else {
                        queue.offer(new int[]{new_i, new_j});
                        visited.computeIfAbsent(state, k -> new HashSet<>()).add(Arrays.toString(new int[]{new_i, new_j}));
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] board = new char[n][n];
        int[] start = {-1, -1};
        int[] end = {-1, -1};

        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = row.charAt(j);
                if (board[i][j] == 'S') {
                    start = new int[]{i, j};
                } else if (board[i][j] == 'F') {
                    end = new int[]{i, j};
                }
            }
        }

        int result = bfs(board, n, start, end);
        System.out.println(result);
    }
}