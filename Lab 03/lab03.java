import java.util.Scanner;

public class lab03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = 10;
        System.out.println("Enter the number of values you want to enter");
        k = sc.nextInt();

        // defining the array
        int[] numbers = new int[k];

        // taking the input
        System.out.println("Enter the values");
        for (int i = 0; i < k; i++) {
            numbers[i] = sc.nextInt();
        }

        // reading the array we are going to work with
        System.out.println("The numbers are :");
        for (int i = 0; i < k; i++) {
            System.out.println(numbers[i]);
        }

        // Creating a menu

        System.out.println("Select the operation you want to perform");
        System.out.println("1.Find the Mean Value");
        System.out.println("2.Find the Median Value");
        System.out.println("3.Find the Mode Value");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Mean =" + mean(numbers));
                break;

            case 2:

                System.out.println("Median =" + median(numbers));
                break;

            case 3:

                System.out.println("Mode =" + mode(numbers));
                break;

            default:
                System.out.println("Enter a valid operation");

        }

    }

    public static double mean(int a[]) {

        int len = a.length; // length of the array

        // calculation the sum of all the elements

        int sum = 0;

        for (int i = 0; i < len; i++) {

            sum = sum + a[i];

        }

        double avg = (double) sum / len;

        return avg;

    }

    public static double median(int a[]) {

        // Sorting the array in Ascending Order before finding median

        int temp;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        double average = 0;

        if (len % 2 == 0) {
            average = (a[len / 2] + a[((len / 2) + 1)]) / 2;
        } else if (len % 2 != 0) {
            average = a[Math.round(len / 2)];
        }

        return average;

    }

    public static double mode(int a[]) {

        int len = a.length;
        int maxfreq = 0;
        double maxvalue = 0;

        for (int i = 0; i < len; i++) {
            int freq = 0;
            for (int j = 0; j < len; j++) {
                if (a[i] == a[j]) {
                    freq = freq + 1;
                }

                if (freq > maxfreq) {
                    maxfreq = freq;
                    maxvalue = a[i];
                }

            }

        }

        return maxvalue;

    }

}
