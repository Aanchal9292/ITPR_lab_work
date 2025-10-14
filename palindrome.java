// package project1;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        int number, originalNumber, reversedNumber = 0, remainder;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        sc.close();

        originalNumber = number; // store the original number

        // Reverse the number using while loop
        while (number != 0) {
            remainder = number % 10;              // get the last digit
            reversedNumber = reversedNumber * 10 + remainder; // build reversed number
            number = number / 10;                 // remove last digit
        }

        System.out.println("--------------------------------");
        System.out.println("Original Number : " + originalNumber);
        System.out.println("Reversed Number : " + reversedNumber);

        // Check palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(" The number is a Palindrome!");
        } else {
            System.out.println("The number is NOT a Palindrome.");
        }
    }
}
