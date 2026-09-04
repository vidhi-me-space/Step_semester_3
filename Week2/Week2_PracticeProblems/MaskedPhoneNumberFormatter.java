public class MaskedPhoneNumberFormatter {

    static String maskPhoneNumber(String phone) {

        // Validate length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Validate that all characters are digits
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Extract the last 4 digits
        String lastFourDigits = phone.substring(phone.length() - 4);

        // Build the masked number
        StringBuilder maskedNumber = new StringBuilder("XXXXXX");

        // Insert "-" before the last 4 digits
        maskedNumber.insert(maskedNumber.length(), "-" + lastFourDigits);

        return maskedNumber.toString();
    }

    public static void main(String[] args) {

        String phone = "9876543210";

        System.out.println(maskPhoneNumber(phone));
    }
}