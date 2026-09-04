import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        int number = sc.nextInt();

        // Store original number
        int origNumber = number;

        // Initialize sum
        int sum = 0;

        // Access each digit
        while (number != 0) {

            int digit = number % 10;

            // Add cube of the digit
            sum = sum + digit * digit * digit;

            // Remove last digit
            number = number / 10;
        }

        // Check Armstrong number
        if (sum == origNumber) {
            System.out.println("Is the number " + origNumber
                    + " an Armstrong number? true");
        } else {
            System.out.println("Is the number " + origNumber
                    + " an Armstrong number? false");
        }

        sc.close();
    }
}