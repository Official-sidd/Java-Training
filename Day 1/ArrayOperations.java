import java.util.Scanner;
import java.util.Arrays;

/**
 * Day 01 - Array Operations
 * Concepts Covered:
 * - Arrays
 * - Loops
 * - Methods
 * - Searching
 * - Sorting
 * - Reversing
 * - I/O
 */

public class ArrayOperations {

    // Linear Search
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Reverse Array
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        int index = search(numbers, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        // Reversing
        reverse(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));

        scanner.close();
    }
}
