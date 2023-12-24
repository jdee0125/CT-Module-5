package pack;

import java.util.Scanner;

public class RecursiveProductCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers to calculate their product:");
        double product = getProduct(1, scanner);
        System.out.println("The product of the five numbers is: " + product);
    }

    public static double getProduct(int count, Scanner scanner) {
        if (count <= 5) {
            try {
                System.out.print("Enter number " + count + ": ");
                double num = scanner.nextDouble();
                return num * getProduct(count + 1, scanner);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
                return getProduct(count, scanner);
            }
        } else {
            return 1;
        }
    }
}
