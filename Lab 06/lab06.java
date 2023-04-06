import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab06 {
    public static void main(String[] args) {
        // BufferedReader reader = null;
        String line1 = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));) {

            String line = reader.readLine();

            while (line != null) {

                line1 = line1.concat(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        int len = line1.length();

        // } finally {
        // try {
        // if (reader != null) {
        // reader.close();
        // }
        // } catch (IOException e) {
        // System.err.println(e.getMessage());
        // }
        // }
        vowels(line1, len);
        digit(line1, len);
    }

    static void vowels(String z, int len) {

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

    }

    static void digit(String z, int len) {

        int[] count1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        Character[] digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        for (int j = 0; j < len; j++) {

            Character c1 = z.charAt(j);

            for (int k = 0; k < 10; k++) {

                Character v = digit[k];

                if (c1.equals(v)) {
                    count1[k] = count1[k] + 1;
                }

            }

        }

        System.out.println("The digit count is: ");

        for (int k = 0; k < 10; k++) {
            System.out.println(digit[k] + " : " + count1[k]);

        }

    }

    static void most_repeated_words(String z, int len) {

        int count = 0;

        for (int i = 0; i < len; i++) {
            Character o = z.charAt(i);
            if (o.equals(' ')) {
                count = count + 1;
            }
        }

        String[] words = new String[count - 1];

        for (int i = 0; i < len; i++) {
            String word = "";
            for (int j = 0; j < len; j++) {
                Character c = z.charAt(j);
                if ((!c.equals(' '))) {
                    String s = Character.toString(c);
                    word = word.concat(s);
                } else if (c.equals(' ')) {
                    break;
                }

            }
            words[i] = word;

        }

    }

}
