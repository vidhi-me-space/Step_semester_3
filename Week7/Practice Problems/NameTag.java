class NameTag {
    private final String firstName;
    private final String lastName;

    // Constructor
    public NameTag(String fullName) {
        String[] parts = fullName.split(" ");

        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    // Return nickname
    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class Main {
    public static void main(String[] args) {

        NameTag tag = new NameTag("Maria Gomez");

        System.out.println(tag.getNickname());
    }
}