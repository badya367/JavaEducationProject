package tinkoff.Task3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        TreeMap<String, List<String>> directories = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String path = scanner.nextLine();
            String[] parts = path.split("/");
            String currentDir = "";
            for (String part : parts) {
                if (!part.isEmpty()) {
                    currentDir += "/" + part;
                    directories.putIfAbsent(currentDir, new ArrayList<>());
                }
            }
        }

        printDirectories(directories);
    }

    private static void printDirectories(TreeMap<String, List<String>> directories) {
        boolean isFirst = true;
        for (Map.Entry<String, List<String>> entry : directories.entrySet()) {
            String directory = entry.getKey();
            if (isFirst) {
                System.out.println(directory.substring(1));
                isFirst = false;
            } else {
                int depth = directory.split("/").length - 2;
                StringBuilder indentation = new StringBuilder();
                for (int i = 0; i < depth; i++) {
                    indentation.append("  ");
                }
                System.out.println(indentation + directory.substring(directory.lastIndexOf("/") + 1));
            }
        }
    }
}