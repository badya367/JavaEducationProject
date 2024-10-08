package tinkoff.Task4;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String type = scanner.next();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        if ("L".equals(type)){
            rotateMatrixBy90DegreesLeft(matrix);
        } else if ("R".equals(type)){
            rotateMatrixBy90Degrees(matrix);
        }


    }

    public static void rotateMatrixBy90Degrees(int[][] matrix) {
        int count = 0;
        StringJoiner stringJoiner = new StringJoiner("\n");
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = matrix[i][j];
                if (matrix[i][j] != matrix[n-1-j][i]){
                    matrix[i][j] = matrix[n - 1 - j][i];
                    stringJoiner.add(i + " " + j + " " + (n - 1 - j) + " " + i);
                    count++;
                }
                if(matrix[n - 1 - j][i] != matrix[n - 1 - i][n - 1 - j]){
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    stringJoiner.add((n - 1 - j) + " " + i + " " + (n - 1 - i) + " " + (n - 1 - j));
                    count++;
                }
                if(matrix[n - 1 - i][n - 1 - j] != matrix[j][n - 1 - i]){
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    stringJoiner.add((n - 1 - i) + " " + (n - 1 - j) + " " + j + " " + (n - 1 - i));
                    count++;
                }
                if(matrix[j][n - 1 - i] != temp){
                    matrix[j][n - 1 - i] = temp;
                    stringJoiner.add(j + " " + (n - 1 - i) + " " + i + " " + j);
                    count++;
                }
            }
            System.out.println(count + "\n" + stringJoiner);
        }
    }

    public static void rotateMatrixBy90DegreesLeft(int[][] matrix) {
        int count = 0;
        StringJoiner stringJoiner = new StringJoiner("\n");
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = matrix[j][n - 1 - i];
                if(matrix[j][n - 1 - i] != matrix[n - 1 - i][n - 1 - j]){
                    matrix[j][n - 1 - i] = matrix[n - 1 - i][n - 1 - j];
                    count++;
                    stringJoiner.add(j + " " + (n - 1 - i) + " " + (n - 1 - i) + " " + (n - 1 - j));
                }
                if(matrix[n - 1 - i][n - 1 - j] != matrix[n - 1 - j][i]){
                    matrix[n - 1 - i][n - 1 - j] = matrix[n - 1 - j][i];
                    count++;
                    stringJoiner.add((n - 1 - i) + " " + (n - 1 - j) + " " + (n - 1 - j) + " " + (i));
                }
                if(matrix[n - 1 - j][i] != matrix[i][j]){
                    matrix[n - 1 - j][i] = matrix[i][j];
                    count++;
                    stringJoiner.add((n - 1 - j) + " " + i + " " + i + " " + j);
                }
                if(matrix[i][j] != temp){
                    matrix[i][j] = temp;
                    stringJoiner.add(j + " " + (n - 1 - i) + " " + i + " " + j);
                    count++;
                }
            }
        }
        System.out.println(count + "\n" + stringJoiner);
    }
}
