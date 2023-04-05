import java.util.Scanner;

public class lab05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Student[] ns = new Student[100];

        int k = 0;
        int choice;

        for (int j = 0;; j++) {

            do {
                System.out.println("1. Add a student");
                System.out.println("2. Search for a student");
                System.out.println("3. Display all students");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        String[] details = add(ns);
                        ns[k] = new Student(details[0], details[1], details[2], details[3], details[4], details[5]);
                        k++;
                        break;
                    case 2:
                        search(ns, k);
                        break;
                    case 3:
                        display(ns);
                        break;
                    default:
                        System.out.println("Invalid Choice. Please enter again");

                }

            } while (choice != 1 && choice != 2 && choice != 3);

            Character choice1;
            Character yes = 'y';
            Character no = 'n';
            do {
                System.out.println("Enter y to continue and n to not continue");
                choice1 = sc.next().charAt(0);
                sc.nextLine();
                if (choice1.equals(yes)) {
                    continue;
                } else if (choice1.equals(no)) {
                    break;
                } else {
                    System.out.println("Invalid Input. Enter again");
                }
            } while (choice1 != 'y' && choice1 != 'n');

        }

    }

    static String[] add(Student[] a) {

        String regno;
        int i = 0;
        int c = 0;

        System.out.println("Enter Registration Number: ");
        regno = sc.nextLine();

        c = c + 1;
        if (c > 1) {
            for (i = 0; i < 100; i++) {
                if (regno.equals(a[i].get_regno())) {
                    System.out.println("Student already exists. Enter again");
                    add(a);
                }
            }
        }

        System.out.println("Enter name");
        String name = sc.nextLine();

        // do {
        // System.out.println("Enter Registration Number");
        // regno = sc.nextLine();
        // for (i = 0; i < 100; i++) {
        // if (a[i] != null) {
        // if (regno.equals(a[i].get_regno())) {
        // System.out.println("Registration Number already exists. Enter again.");
        // }
        // } else {
        // break;
        // }

        // }
        // } while (regno.equals(a[i].get_regno()));

        System.out.println("Enter e-mail");
        String email = sc.nextLine();
        System.out.println("Enter Phone Number");
        String phone = sc.nextLine();
        System.out.println("Enter Class");
        String Class = sc.nextLine();
        System.out.println("Enter department");
        String dept = sc.nextLine();

        String[] details = { regno, name, email, phone, Class, dept };

        return details;

    }

    static String[] add(Student[] a, String name, String regno) {

        int i;
        do {
            System.out.println("Enter Registration Number");
            regno = sc.nextLine();
            for (i = 0; i < 100; i++) {
                if (a[i] != null) {
                    if (regno.equals(a[i].get_regno())) {
                        System.out.println("Registration Number already exists. Enter again.");
                    }
                } else {
                    break;
                }

            }
        } while (regno.equals(a[i].get_regno()));

        System.out.println("Enter e-mail");
        String email = sc.nextLine();
        System.out.println("Enter Phone Number");
        String phone = sc.nextLine();
        System.out.println("Enter Class");
        String Class = sc.nextLine();
        System.out.println("Enter department");
        String dept = sc.nextLine();
        String[] details = { regno, name, email, phone, Class, dept };

        return details;

    }

    static void display(Student[] ns) {
        for (int i = 0;; i++) {
            if (ns[i] == null) {
                break;
            }
            System.out.println("Student " + (i + 1));
            System.out.println("");
            ns[i].printdetails();
            System.out.println("");
            System.out.println("");
        }
    }

    static void search(Student[] a, int l) {

        System.out.println("Enter Name of the student you want to search");
        String sname = sc.nextLine();
        System.out.println("Enter Registration Number of the student");
        String sreg = sc.nextLine();
        for (int i = 0; i <= l; i++) {
            if (sname.equals(a[i].get_name()) && sreg.equals(a[i].get_regno())) {
                a[i].printdetails();
            } else {
                Character y = 'y';
                Character n = 'n';
                Character yn;
                do {
                    System.out.println("No such record exists.");
                    System.out.println("Do you want to add this to the record");
                    yn = sc.nextLine().charAt(0);
                    if (yn.equals(y)) {
                        add(a, sname, sreg);
                    } else if (yn.equals(n)) {
                        System.out.println("Okay. Thank you.");
                        break;
                    } else {
                        System.out.println("Invalid Input. Try again");
                    }

                } while (yn != 'y' && yn != 'n');
                break;
            }
        }

    }

}

class Student {

    String regno;
    String name;
    String email;
    String phone;
    String Class;
    String dept;

    Student() {

    }

    Student(String regno, String name, String email, String phone, String Class, String dept) {
        this.regno = regno;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.Class = Class;
        this.dept = dept;
    }

    String get_name() {
        return this.name;
    }

    String get_regno() {
        return this.regno;
    }

    void printdetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Registration Number: " + this.regno);
        System.out.println("Enail: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Class: " + this.Class);
        System.out.println("Department: " + this.dept);
        System.out.println(" ");
    }

}
