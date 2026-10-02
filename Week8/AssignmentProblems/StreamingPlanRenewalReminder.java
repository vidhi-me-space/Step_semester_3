import java.util.*;

interface SubscriptionPlan {
    int getValidityDays();
}

class BasicPlan implements SubscriptionPlan {

    public int getValidityDays() {
        return 30;
    }
}

class StandardPlan implements SubscriptionPlan {

    public int getValidityDays() {
        return 90;
    }
}

class PremiumPlan implements SubscriptionPlan {

    public int getValidityDays() {
        return 365;
    }
}

public class StreamingPlanRenewalReminder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            String startDate = sc.next();

            SubscriptionPlan plan;

            if (type.equals("BASIC")) {
                plan = new BasicPlan();
            }
            else if (type.equals("STANDARD")) {
                plan = new StandardPlan();
            }
            else {
                plan = new PremiumPlan();
            }

            int days = plan.getValidityDays();

            java.time.LocalDate date =
                    java.time.LocalDate.parse(startDate);

            java.time.LocalDate renewalDate =
                    date.plusDays(days);

            System.out.println(
                    name + ": " + renewalDate
            );
        }

        sc.close();
    }
}