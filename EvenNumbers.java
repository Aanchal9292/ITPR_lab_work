import java.util.Scanner;

public class EvenNumbers {

    // Function to input 20 numbers
    public static int[] inputNumbers() {
        Scanner sc = new Scanner(System.in);    //Creating object of Scanner class to initialize elements into the array
        int[] nums = new int[20];
        
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }
    

    // Function to print even numbers
    public static void printEvenNumbers(int[] nums) {
        System.out.println("Even numbers are:");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = inputNumbers();     // Call input function
        printEvenNumbers(numbers);          // Call print function
    }
    
}
