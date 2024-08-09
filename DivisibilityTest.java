import java.util.Scanner;

public class DivisibilityTest {

    public static void checkDivisibility(int number) {
        // Special case for zero
        if (number == 0) {
            System.out.println("0 is divisible by every number except 0.");
            return;
        }

        // Loop through numbers from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                // Every number is divisible by 1
                System.out.println(number + " is divisible by " + i + " because every number is divisible by 1.");
            } else if (i == 2) {
                // Check divisibility by 2
                if (number % 2 == 0) {
                    System.out.println(number + " is divisible by " + i + " because it is even.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because it is not even.");
                }
            } else if (i == 3) {
                // Check divisibility by 3 using the sum of digits
                if (sumOfDigits(number) % 3 == 0) {
                    System.out.println(number + " is divisible by " + i + " because the sum of its digits is divisible by 3.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because the sum of its digits is not divisible by 3.");
                }
            } else if (i == 4) {
                // Check divisibility by 4 using the last two digits
                if (number % 100 % 4 == 0) {
                    System.out.println(number + " is divisible by " + i + " because the last two digits form a number divisible by 4.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because the last two digits do not form a number divisible by 4.");
                }
            } else if (i == 5) {
                // Check divisibility by 5
                if (number % 10 == 0 || number % 10 == 5) {
                    System.out.println(number + " is divisible by " + i + " because it ends with a 0 or 5.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because it does not end with a 0 or 5.");
                }
            } else if (i == 6) {
                // Check divisibility by 6 (must be divisible by 2 and 3)
                if (number % 2 == 0 && sumOfDigits(number) % 3 == 0) {
                    System.out.println(number + " is divisible by " + i + " because it is divisible by both 2 and 3.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because it is not divisible by both 2 and 3.");
                }
            } else if (i == 7) {
                // Check divisibility by 7
                if (number % 7 == 0) {
                    System.out.println(number + " is divisible by " + i + ".");
                } else {
                    System.out.println(number + " is not divisible by " + i + ".");
                }
            } else if (i == 8) {
                // Check divisibility by 8 using the last three digits
                if (number % 1000 % 8 == 0) {
                    System.out.println(number + " is divisible by " + i + " because the last three digits form a number divisible by 8.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because the last three digits do not form a number divisible by 8.");
                }
            } else if (i == 9) {
                // Check divisibility by 9 using the sum of digits
                if (sumOfDigits(number) % 9 == 0) {
                    System.out.println(number + " is divisible by " + i + " because the sum of its digits is divisible by 9.");
                } else {
                    System.out.println(number + " is not divisible by " + i + " because the sum of its digits is not divisible by 9.");
                }
            }
        }
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        checkDivisibility(number);
    }
}
