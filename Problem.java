import java.util.Scanner;

public class ArrayOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[] array = new int[10];

      
        System.out.println("Enter 10 values of elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("A[" + (i + 1) + "]= ");
            array[i] = scanner.nextInt();
        }

       
        System.out.print("Enter the element that you want to check its occurrence: ");
        int numberToCheck = scanner.nextInt();

    
        int occurrenceCount = 0;
        for (int value : array) {
            if (value == numberToCheck) {
                occurrenceCount++;
            }
        }

     
        System.out.println("The element " + numberToCheck + " is repeated " + occurrenceCount + " times");


        
        scanner.close();
    }
}
