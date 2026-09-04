public class CSVStudentRecordParser {

    static void parseStudentRecord(String csvLine) {

        // Split the CSV line into fields
        String[] fields = csvLine.split(",");

        // Validate that exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Print formatted record
        System.out.println("Name: " + fields[0]
                + " | Roll No: " + fields[1]
                + " | Dept: " + fields[2]);
    }

    public static void main(String[] args) {

        String csvLine = "Ananya Verma,RA2211003010123,CSE";

        parseStudentRecord(csvLine);
    }
}