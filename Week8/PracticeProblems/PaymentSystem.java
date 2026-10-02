import java.util.*;

interface Payment {
    double calculateAmount(double amount);
    String getType();
}

class Card implements Payment {
    public double calculateAmount(double amount) {
        return amount + (amount * 0.02);
    }

    public String getType() {
        return "CARD";
    }
}

class Wallet implements Payment {
    public double calculateAmount(double amount) {
        return amount + (amount * 0.01);
    }

    public String getType() {
        return "WALLET";
    }
}

class BankTransfer implements Payment {
    public double calculateAmount(double amount) {
        return amount;
    }

    public String getType() {
        return "BANKTRANSFER";
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            Payment payment;

            if (type.equals("CARD")) {
                payment = new Card();
            } else if (type.equals("WALLET")) {
                payment = new Wallet();
            } else {
                payment = new BankTransfer();
            }

            double adjustedAmount = payment.calculateAmount(amount);

            System.out.printf("%s: %.2f%n",
                    payment.getType(), adjustedAmount);

            total += adjustedAmount;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}