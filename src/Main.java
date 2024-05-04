import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("", 0, "", "", 0, 0);

        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            if (!name.matches(".*\\d.*")) {
                student.setSName(name);
                break;
            } else {
                System.out.println("Invalid name. Please enter a name without numbers.");
            }
        }

        while (true) {
            System.out.println("Enter your ID number: ");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                student.setIDnumber(id);
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // consume the invalid input
            }
        }

        while (true) {
            System.out.println("Enter your Phone number: ");
            if (scanner.hasNextInt()) {
                int SPhone = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                student.setIDnumber(SPhone);
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // consume the invalid input
            }
        }

        while (true) {
            System.out.println("Enter your email: ");
            String email = scanner.nextLine();
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                student.setEmail(email);
                break;
            } else {
                System.out.println("Invalid email format. Please enter a valid email.");
            }
            // after the file has been uploaded and stored in the database, the path to the file will be stored in the student object
            student.setSfile("path/to/the/file");
        }
    }
}