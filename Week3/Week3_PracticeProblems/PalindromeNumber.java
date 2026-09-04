import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        int number = sc.nextInt();

        // Store original number
        int origNumber = number;

        // Initialize reversed number
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {

            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;
        }

        // Check palindrome
        if (reversedNumber == origNumber) {
            System.out.println("Is the number " + origNumber
                    + " a Palindrome? true");
        } else {
            System.out.println("Is the number " + origNumber
                    + " a Palindrome? false");
        }

        sc.close();
    }
}
}