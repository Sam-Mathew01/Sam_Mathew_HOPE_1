import java.util.Scanner;
import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:/Users/samjo/HOPE TRAINING/XML Parser/students.xml";
        StudentService service = new StudentService(filePath);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display All Students");
            System.out.println("2. Find Student by ID");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.displayAll();
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Student student = service.findById(id);

                    if (student != null)
                        System.out.println(student);
                    else
                        System.out.println("Student not found!");
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}