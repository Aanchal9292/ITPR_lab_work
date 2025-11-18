package project1;

import java.util.Scanner;

public class AdditionAndDiference {
    public static void main(String[] args) {

		int num1,num2;
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//Input of Numbers
		System.out.print("Enter 1st number : ");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		num2 = sc.nextInt();
		System.out.println("-----------------------------------------------");
		//Displaying number to the user
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
		if(num1<num2)
		{
			System.out.println("Sum : "+(num1+num2));
		}
		else
		{
			System.out.println("Difference : "+(num1-num2));
		}

	}
}

