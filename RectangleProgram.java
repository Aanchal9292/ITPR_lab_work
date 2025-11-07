import java.util.Scanner;

// Custom Exception Class
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

// Class to calculate area and perimeter
class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Length and Width must be greater than zero.");
        }
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter width of rectangle: ");
            double width = sc.nextDouble();

            Rectangle r = new Rectangle(length, width);

            System.out.println("---------------------------------");
            System.out.println("Area: " + r.calculateArea());
            System.out.println("Perimeter: " + r.calculatePerimeter());

        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());  // Custom exception message
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}
