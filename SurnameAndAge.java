import java.util.Scanner;

public class SurnameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter their surname and age
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the number of characters in the surname
        int surnameLength = surname.length();

        // Determine if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Print results
        System.out.println("The number of characters in your surname is " + surnameLength + ".");
        System.out.println("Your current age is an " + ageType + " number.");
    }
}