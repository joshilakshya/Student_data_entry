//Main.java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            // Display menu
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter PRN: ");
                        int prn = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter Branch: ");
                        String branch = scan.nextLine();
                        System.out.print("Enter Batch: ");
                        String batch = scan.nextLine();
                        System.out.print("Enter CGPA: ");
                        float cgpa = scan.nextFloat();
                        scan.nextLine();
                        operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                        System.out.println("Student added successfully.");
                        break;

                    case 2:
                        operations.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter PRN to search: ");
                        prn = scan.nextInt();
                        scan.nextLine();
                        operations.searchByPRN(prn).display();
                        break;

                    case 4:
                        System.out.print("Enter Name to search: ");
                        name = scan.nextLine();
                        operations.searchByName(name).display();
                        break;

                    case 5:
                        System.out.print("Enter Position (Index): ");
                        int index = scan.nextInt();
                        scan.nextLine();
                        operations.searchByPosition(index).display();
                        break;

                    case 6:
                        System.out.print("Enter PRN of student to update: ");
                        prn = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter New Name: ");
                        name = scan.nextLine();
                        System.out.print("Enter New Branch: ");
                        branch = scan.nextLine();
                        System.out.print("Enter New Batch: ");
                        batch = scan.nextLine();
                        System.out.print("Enter New CGPA: ");
                        cgpa = scan.nextFloat();
                        scan.nextLine();
                        operations.updateStudent(prn, name, branch, batch, cgpa);
                        System.out.println("Student updated successfully.");
                        break;

                    case 7:
                        System.out.print("Enter PRN of student to delete: ");
                        prn = scan.nextInt();
                        scan.nextLine();
                        operations.deleteStudent(prn);
                        System.out.println("Student deleted successfully.");
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        break;

                    default:
                        throw new InvalidInputException("Invalid menu choice. Try again.");
                }
            } catch (StudentNotFoundException | StudentAlreadyExistsException | InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please enter data correctly.");
                scan.nextLine(); // clear buffer
            }
        } while (choice != 8);

        scan.close();
    }
}
