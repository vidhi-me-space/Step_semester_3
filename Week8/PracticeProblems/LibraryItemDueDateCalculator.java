import java.util.*;

interface LibraryItem {
    int getBorrowDays();
    String getTitle();
}

class Book implements LibraryItem {
    String title;

    Book(String title) {
        this.title = title;
    }

    public int getBorrowDays() {
        return 14;
    }

    public String getTitle() {
        return title;
    }
}

class DVD implements LibraryItem {
    String title;

    DVD(String title) {
        this.title = title;
    }

    public int getBorrowDays() {
        return 7;
    }

    public String getTitle() {
        return title;
    }
}

class Magazine implements LibraryItem {
    String title;

    Magazine(String title) {
        this.title = title;
    }

    public int getBorrowDays() {
        return 3;
    }

    public String getTitle() {
        return title;
    }
}

public class LibraryItemDueDateCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int currentDay = 26;
        int currentMonth = 10;
        int currentYear = 2023;

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();

            String[] parts = input.split(" ", 2);

            String type = parts[0];
            String title = parts[1].replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            }
            else if (type.equals("DVD")) {
                item = new DVD(title);
            }
            else {
                item = new Magazine(title);
            }

            int days = item.getBorrowDays();

            int dueDay = currentDay + days;
            int dueMonth = currentMonth;
            int dueYear = currentYear;

            if (dueDay > 31) {
                dueDay = dueDay - 31;
                dueMonth++;
            }

            System.out.printf("%s: %04d-%02d-%02d%n",
                    item.getTitle(),
                    dueYear,
                    dueMonth,
                    dueDay);
        }

        sc.close();
    }
}