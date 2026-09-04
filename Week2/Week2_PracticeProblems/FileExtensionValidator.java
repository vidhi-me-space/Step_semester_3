public class FileExtensionValidator {

    static String validateFileExtension(String filename) {

        // Find the last '.'
        int dotIndex = filename.lastIndexOf('.');

        // If there is no extension
        if (dotIndex == -1) {
            return "Rejected — invalid file type";
        }

        // Extract extension
        String extension = filename.substring(dotIndex + 1);

        // Compare extension case-insensitively
        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        }

        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {

        String filename = "Assignment1.PDF";

        System.out.println(validateFileExtension(filename));
    }
}