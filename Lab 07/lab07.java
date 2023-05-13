import java.io.*;
import java.util.Scanner;

public class lab07 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("Iris.csv"));

        String[] iris = new String[151];

        int i = 0;

        sc.useDelimiter(",");
        while (sc.hasNext()) {

            iris[i] = sc.nextLine();
            i = i + 1;
        }
        sc.close();

        System.out.println(iris.length);

        for (i = 0; i < iris.length; i++) {
            System.out.println(iris[i]);
        }

        i = 0;
        int k = 0;

        String[][] data = new String[151][6];

        while (i < 151) {
            String[] df = iris[i].split("[,]", 0);
            for (int l = 0; l < 6; l++) {
                data[k][l] = df[l];
            }
            i = i + 1;
            k = k + 1;
        }

        for (k = 0; k < 151; k++) {
            for (int l = 0; l < 6; l++) {
                System.out.println(data[k][l]);
            }
        }

        double[][] datanew = stringtoduble(data);

        double[] means = mean(datanew);
        for (i = 0; i < 4; i++) {
            System.out.println(means[i]);
        }

        median(datanew);

    }

    static double[][] stringtoduble(String[][] data) {

        double[][] datanew = new double[150][4];
        for (int i = 1; i < 151; i++) {
            for (int j = 1; j < 5; j++) {
                datanew[i][i] = Double.parseDouble(data[i][i]);
            }
        }

        return datanew;
    }

    static double[] mean(double[][] data) {

        // Id-0
        // SepalLengthCm-1
        // SepalWidthCm-2
        // PetalLengthCm-3
        // PetalWidthCm-4
        // Species-5

        int j = 1, k = 0, i;

        double[] mean1 = new double[4];

        while (j < 5) {

            double sum = 0.0;

            for (i = 1; i < 151; i++) {

                sum = sum + data[i][j];

            }
            double means = sum / 150;
            j = j + 1;

            while (k < 4) {
                mean1[k] = means;
                break;
            }
            k = k + 1;
        }

        return mean1;

    }

    static void median(double[][] data) {

        int j = 1;
        while (j < 5) {
            for (int i = 1; i < 151; i++) {

                if ((data[i][j]) <= (data[i + 1][j])) {

                    continue;

                }
            }
        }

    }

}