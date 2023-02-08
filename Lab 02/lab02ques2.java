import java.util.Scanner;

public class lab02ques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        String name = "";
        String temp = "";
        int i;
        String[] names = new String[1024];
        i = -1;
        do {
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show all names");
            System.out.println("5. Exit the program");
            System.out.print("Select one option: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    i = i + 1;
                    System.out.print("Enter a name: ");
                    name = scan.next();

                    for (int j = 0; j <= i; j++) {

                        temp = names[j];
                        if (i != 0 && temp == name) {
                            System.out.println(name + " already exists in the array.");
                            i = i - 1;
                            break;
                        }

                        else {
                            names[i] = name;
                            break;
                        }
                    }
                    System.out.println("");
                    break;

                case 2:
                    String ans = "no";
                    System.out.print("Enter the name: ");
                    name = scan.next();
                    for (int j = 0; j <= i; j++) {
                        if (names[j].compareTo(name) == 0) {
                            System.out.println(name + " exists at index number " + j);
                            ans = "yes";
                            break;
                        }
                    }
                    if (ans == "no") {
                        System.out.println(name + " does not exist.");
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Enter the name that you want to remove: ");
                    name = scan.next();
                    String[] temp_array = new String[1024];
                    int k = -1;
                    for (int j = 0; j <= i; j++) {
                        if (names[j].compareTo(name) == 0) {
                            System.out.println(name + "exists at index number " + j + "And its deleted.");
                            names[j] = "";

                        } else {
                            k = k + 1;
                            temp_array[k] = names[j];
                        }
                        names = temp_array;
                    }

                    System.out.println("");
                    break;

                case 4:
                    for (int j = 0; j <= i; j++) {
                        System.out.println("[" + j + "]: " + names[j]);
                    }
                    System.out.println("");
                    break;

            }

        } while (option != 5);

    }
}