import java.util.Scanner;

public class GreatestNumber {

    // Function to input 15 numbers into an array
    public static int[] inputNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[15];
        
        System.out.println("Enter 15 numbers:");   //Creating object of Scanner class to initialize elements into the array
        for (int i = 0; i < 15; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }
    

    // Function to find the greatest number in the array
    public static int findGreatest(int[] nums) {
        int max = nums[0]; // Assume first number is greatest
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = inputNumbers();      // Input numbers
        int greatest = findGreatest(numbers); // Find greatest
        System.out.println("The greatest number is: " + greatest);
    }
}
