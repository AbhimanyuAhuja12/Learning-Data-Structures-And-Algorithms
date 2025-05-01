package TwoDArrays;

import java.util.*;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the shell no. that you want to rotate: ");
        int shellNo = input.nextInt();
        System.out.println("Input how many times you want to rotate: ");
        int rotations = input.nextInt();

        rotateThatShell(matrix, shellNo, rotations);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void rotateThatShell(int[][] matrix, int shellNo, int rotations) {
        int[] oned = extractShell(matrix, shellNo);
        rotateArray(oned, rotations);
        fillShell(matrix, shellNo, oned);
    }

    private static int[] extractShell(int[][] matrix, int s) {
        int rowStart = s - 1;
        int colStart = s - 1;
        int rowEnd = matrix.length - s;
        int colEnd = matrix[0].length - s;

        List<Integer> list = new ArrayList<>();

        // Left wall
        for (int i = rowStart; i <= rowEnd; i++) list.add(matrix[i][colStart]);

        // Bottom wall
        for (int j = colStart + 1; j <= colEnd; j++) list.add(matrix[rowEnd][j]);

        // Right wall
        for (int i = rowEnd - 1; i >= rowStart; i--) list.add(matrix[i][colEnd]);

        // Top wall
        for (int j = colEnd - 1; j >= colStart + 1; j--) list.add(matrix[rowStart][j]);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void fillShell(int[][] matrix, int s, int[] oned) {
        int rowStart = s - 1;
        int colStart = s - 1;
        int rowEnd = matrix.length - s;
        int colEnd = matrix[0].length - s;

        int idx = 0;

        // Left wall
        for (int i = rowStart; i <= rowEnd; i++) matrix[i][colStart] = oned[idx++];

        // Bottom wall
        for (int j = colStart + 1; j <= colEnd; j++) matrix[rowEnd][j] = oned[idx++];

        // Right wall
        for (int i = rowEnd - 1; i >= rowStart; i--) matrix[i][colEnd] = oned[idx++];

        // Top wall
        for (int j = colEnd - 1; j >= colStart + 1; j--) matrix[rowStart][j] = oned[idx++];
    }

    private static void rotateArray(int[] arr, int r) {
        r = r % arr.length;
        if (r < 0) r += arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, r - 1);
        reverse(arr, r, arr.length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
