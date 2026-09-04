import java.util.Scanner;

public class GCDOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // Store original values for output
        int originalNumber1 = number1;
        int originalNumber2 = number2;

        // Euclidean algorithm
        while (number2 != 0) {

            int remainder = number1 % number2;

            number1 = number2;
            number2 = remainder;
        }

        // number1 now contains the GCD
        System.out.println("The GCD of " + originalNumber1
                + " and " + originalNumber2
                + " is " + number1);

        sc.close();
    }
}