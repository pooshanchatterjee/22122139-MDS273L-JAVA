
import java.util.Scanner;

public class lab05 {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int studentCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    public static void addStudent() {
        System.out.print("Enter Reg. No.: ");
        String regNo = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Class: ");
        String className = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        students[studentCount] = new Student(regNo, name, email, phone, className, department);
        studentCount++;

        System.out.println("Student added successfully!");
    }

    public static void searchStudent() {
        System.out.print("Enter Reg. No. to search: ");
        String regNo = scanner.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].regNo.equals(regNo)) {
                students[i].printDetails();
                return;
            }
        }

        System.out.println("No student found with Reg. No.: " + regNo);
    }

    public static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display!");
            return;
        }

        System.out.println("List of students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + ".");
            students[i].printDetails();
        }
    }
}

class Student {
    String regNo;
    String name;
    String email;
    String phone;
    String className;
    String department;

    public Student(String regNo, String name, String email, String phone, String className, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.className = className;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + className);
        System.out.println("Department: " + department);
    }
}
