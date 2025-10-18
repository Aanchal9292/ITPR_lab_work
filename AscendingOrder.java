import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder {

    // Function to input 10 numbers into an array
    public static int[] inputNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    // Function to sort numbers in ascending order
    public static void sortAscending(int[] nums) {
        Arrays.sort(nums); // Built-in Java function for sorting
    }

    // Function to display the array
    public static void displayArray(int[] nums) {
        System.out.println("Numbers in ascending order:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = inputNumbers();  // Step 1: Take input
        sortAscending(numbers);          // Step 2: Sort array
        displayArray(numbers);           // Step 3: Display sorted numbers
    }
}

