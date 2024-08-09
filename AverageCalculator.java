import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double sum = 0;

        // Ask user to enter marks for five units
        System.out.println("Enter the marks for five units:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i]; // Accumulate the sum of the marks
        }

        // Calculate average and display it
        double average = sum / 5;
        System.out.printf("The average mark is: %.2f%n", average); // Display average with two decimal places
    }
}