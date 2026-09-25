class Locker {
    private String combination;
    private final int lockerNumber;

    // Constructor
    public Locker(int lockerNumber, String combination) {
        this.lockerNumber = lockerNumber;
        this.combination = combination;
    }

    // Change combination only if current code is correct
    public void changeCode(String currentCode, String newCode) {
        if (combination.equals(currentCode)) {
            combination = newCode;
            System.out.println("Code changed successfully");
        } else {
            System.out.println("Code change rejected");
        }
    }

    // We can provide the locker number, but NOT the combination
    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        Locker l = new Locker(101, "1234");

        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}