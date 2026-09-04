import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get integer input
        int number = sc.nextInt();

        // Initialize isPrime to true
        boolean isPrime = true;

        // Check divisibility from 2 to number - 1
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Print result
        System.out.println("Is the number " + number
                + " a Prime number? " + isPrime);

        sc.close();
    }
}