import java.util.Scanner;

/**
 * Day 02 - Control Flow & Patterns
 * Concepts Covered:
 * - if-else
 * - switch
 * - loops (for, while)
 * - 1D arrays
 * - pattern printing
 */

public class ControlFlowAndPatterns {

    // Method to check even or odd using if-else
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // Method using switch
    public static void checkDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend or Invalid day");
        }
    }

    // Pattern printing
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // If-Else
        System.out.print("Enter a number to check Even/Odd: ");
        int number = sc.nextInt();
        checkEvenOdd(number);

        // Switch
        System.out.print("Enter day number (1-5): ");
        int day = sc.nextInt();
        checkDay(day);

        // 1D Array + Loop
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);

        // Pattern
        System.out.print("Enter number of rows for pattern: ");
        int rows = sc.nextInt();
        printPattern(rows);

        sc.close();
    }
}
