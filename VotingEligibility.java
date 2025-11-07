import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative.");
            }
            if (age > 120) {
                throw new InvalidAgeException("Age cannot be more than 120.");
            }

            if (age >= 18) {
                System.out.println("Person is eligible for voting.");
            } else {
                System.out.println("Person is NOT eligible for voting.");
            }

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());  // Custom exception message
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}
