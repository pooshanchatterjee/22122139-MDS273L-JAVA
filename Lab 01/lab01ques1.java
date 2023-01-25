import java.util.Scanner;

class lab01ques1 {
    public static void main(String[] args) {

        String name;
        int age;
        char gender;
        boolean married;
        float salary;

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

        // System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gen +
        // "\nMarried? " + married
        // + "\nSalary: " + salary);

        // Second part

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
                System.out.println("Region : North");
                break;
            }

            case "Delhi": {
                System.out.println("Region : North");
                break;
            }

            case "Haryana": {
                System.out.println("Region : North");
                break;
            }
            case "Jammu kashmir": {
                System.out.println("Region : North");
                break;
            }
            case "Karnataka": {
                System.out.println("Region : South");
                break;
            }
            case "Kerala": {
                System.out.println("Region : South");
                break;
            }
            case "Andhra Pradesh": {
                System.out.println("Region : South");
                break;
            }
            case "Telangana": {
                System.out.println("Region : South");
                break;
            }
            case "Arunachal Pradesh": {
                System.out.println("Region : East");
                break;
            }
            case "Mizoram": {
                System.out.println("Region : East");
                break;
            }
            case "Odisha": {
                System.out.println("Region : East");
                break;
            }
            case "Jharkhand": {
                System.out.println("Region : East ");
                break;
            }
            case "AndhraPradesh": {
                System.out.println("Region : East ");
                break;
            }
            case "Bihar": {
                System.out.println("Region : East ");
                break;

            }
            case "Nagaland": {
                System.out.println("Region : East ");
                break;

            }
            case "Assam": {
                System.out.println("Region : East ");
                break;
            }
        }
    }
}
