import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class lab06 {
    public static void main(String[] args) {

        String data = "";
        try {
            File Obj = new File("text.txt");
            Scanner sc = new Scanner(Obj);
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        vowels(data);
    }

    static void vowels(String z) {

        int len = z.length();
        // int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        System.out.println(len);

        int[] count = { 0, 0, 0, 0, 0 };

        Character[] vow = { 'a', 'e', 'i', 'o', 'u' };
        Character[] vow1 = { 'A', 'E', 'I', 'O', 'U' };

        for (int j = 0; j < len; j++) {

            Character c = z.charAt(j);

            for (int k = 0; k < 5; k++) {

                Character v = vow[k];
                Character V = vow1[k];

                if (c.equals(v) || c.equals(V)) {
                    count[k] = count[k] + 1;
                }

            }

        }

        System.out.println("The vowel count is: ");

        for (int k = 0; k < 5; k++) {
            System.out.println(vow[k] + " : " + count[k]);

        }

        // Character a = 'a';
        // Character A = 'A';
        // Character e = 'e';
        // Character E = 'E';
        // Character i = 'i';
        // Character I = 'I';
        // Character o = 'o';
        // Character O = 'O';
        // Character u = 'u';
        // Character U = 'U';

        // for (int j = 0; i < len; i++) {

        // Character c = z.charAt(j);

        // if (c.equals(a) || c.equals(A)) {
        // c1 = c1 + 1;
        // } else if (c.equals(e) || c.equals(E)) {
        // c2 = c2 + 1;
        // } else if (c.equals(i) || c.equals(I)) {
        // c3 = c3 + 1;
        // } else if (c.equals(o) || c.equals(O)) {
        // c4 = c4 + 1;
        // } else if (c.equals(u) || c.equals(U)) {
        // c5 = c5 + 1;
        // }

        // }

        // System.out.println("the vowel count is: ");
        // System.out.println("[a:" + c1 + " e: " + c2 + " i: " + c3 + " o: " + c4 + "
        // u: " + c5 + "]");

    }
}