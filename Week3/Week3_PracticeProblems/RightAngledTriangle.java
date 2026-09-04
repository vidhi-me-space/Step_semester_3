import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number of rows
        int rows = sc.nextInt();

        System.out.println("The right-angled triangle pattern for "
                + rows + " rows is");

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}