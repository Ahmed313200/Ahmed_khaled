import java.util.Scanner;

public class ArrayOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize array
        int[] array = new int[10];

        // Input values into array
        System.out.println("Enter 10 values of elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("A[" + (i + 1) + "]= ");
            array[i] = scanner.nextInt();
        }

        // Input number to check occurrence
        System.out.print("Enter the element that you want to check its occurrence: ");
        int numberToCheck = scanner.nextInt();

        // Count occurrences
        int occurrenceCount = 0;
        for (int value : array) {
            if (value == numberToCheck) {
                occurrenceCount++;
            }
        }

        // Display result
        System.out.println("The element " + numberToCheck + " is repeated " + occurrenceCount + " times");

        // Close scanner
        scanner.close();
    }
}
