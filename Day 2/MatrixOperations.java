import java.util.Scanner;

/**
 * Day 02 - Matrix Operations
 * Concepts Covered:
 * - 2D Arrays
 * - Nested Loops
 * - Matrix Addition
 * - Matrix Multiplication
 */

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication (only valid if cols of matrix1 == rows of matrix2)
        System.out.println("Matrix Multiplication Result:");

        int[][] multiply = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    multiply[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
