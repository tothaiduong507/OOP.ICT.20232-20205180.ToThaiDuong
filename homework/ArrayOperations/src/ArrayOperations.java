import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average value of array elements
        double average = (double) sum / array.length;

        // Display the sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

        scanner.close();
    }
}
