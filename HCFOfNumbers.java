import java.util.Scanner;

public class HCFOfNumbers {

    // Recursive method to find HCF
    static int hcf(int a, int b) {
        if (b == 0)   // Base case
            return a;
        else           // Recursive case
            return hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = hcf(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + result);
        
        sc.close();
    }
}

