import java.util.Scanner;

class lab01ques1 {
    public static void main(String[] args) {

        String name;
        int age;
        char gender;
        boolean married;
        float salary;
        String region = "";

        String gen = " ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your monthly salary: ");
        salary = Float.parseFloat(scan.nextLine());

        System.out.println("You are married: True or False? ");
        married = Boolean.parseBoolean(scan.nextLine());

        System.out.println("Enter you name: ");
        name = scan.nextLine();

        System.out.println("Enter age: ");
        age = Integer.parseInt(scan.nextLine());

        String state;

        System.out.println("Enter you state: ");
        state = scan.nextLine();

        System.out.println("Enter 'm' for male or 'f' for female: ");
        gender = scan.next().charAt(0);

        if (gender == 'm') {
            gen = "MALE";
        } else if (gender == 'f') {
            gen = "FEMALE";
        }

        switch (state) {
            case "Chandigarh": {
                region = "North";
                break;
            }

            case "Delhi": {
                region = "North";
                break;
            }

            case "Haryana": {
                region = "North";
                break;
            }
            case "Jammu kashmir": {
                region = "North";
                break;
            }
            case "Karnataka": {
                region = "South";
                break;
            }
            case "Kerala": {
                region = "South";
                break;
            }
            case "Andhra Pradesh": {
                region = "South";
                break;
            }
            case "Telangana": {
                region = "South";
                break;
            }
            case "Arunachal Pradesh": {
                region = "South";
                break;
            }
            case "Mizoram": {
                region = "East";
                break;
            }
            case "Odisha": {
                region = "East";
                break;
            }
            case "Jharkhand": {
                region = "East";
                break;
            }
            case "AndhraPradesh": {
                region = "East";
                break;
            }
            case "Bihar": {
                region = "East";
                break;

            }
            case "Nagaland": {
                region = "East";
                break;

            }
            case "Assam": {
                region = "East";
                break;
            }
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.println("Married: " + married);
        System.out.println("Salary: " + salary);
        System.out.println("The student is from region " + region);

    }
}
