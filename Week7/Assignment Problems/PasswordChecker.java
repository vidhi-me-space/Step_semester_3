class PasswordChecker {
    private final String password;

    // Constructor
    public PasswordChecker(String password) {
        this.password = password;
    }

    // Return password strength
    public String getStrength() {
        int length = password.length();

        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println(pc.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefgh");
        System.out.println(pc2.getStrength());

        PasswordChecker pc3 = new PasswordChecker("abcdefghijkl");
        System.out.println(pc3.getStrength());
    }
}