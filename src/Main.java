import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("", 0, "", "", LocalDate.of(2000, 1, 1), 0);

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
                student.setSPhone(SPhone);
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


        }
    }
}
//finish the admin gui
//Make the listeners for each departments so when they press apply in their own departments
//a new applicant object will be created and stored in the arraylist of the department and also added to file with their
//department name as an identifier
//note: the file will be used later to create the tables for the departments in the admin section of the program
//create edit buttons in the admin section for each text area, when the buttons under the text areas are pressed
//the admin can edit the text areas and save the changes
//create tables for each department in the admin section, the tables will be created from the files of the departments
//the tables will be editable and the changes will be saved to the files of the departments
//remove all current compenents inside the admin for the departments and replace them with the tables for their applicants
//and add the buttons for denying and confirming the applicants
