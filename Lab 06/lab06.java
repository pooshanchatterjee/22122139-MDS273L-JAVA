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

        int max_freq = most_repeated_words(line1, len);
        least_repeated_words(line1, len, max_freq);

        int max_char = most_characters(line1, len);
        least_characters(line1, len, max_char);

    }

    static void vowels(String z, int len) {

        // int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        // System.out.println(len);

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

    static int most_repeated_words(String z, int len) {

        String[] words = z.split("\\s+");

        // for (int i = 0; i < words.length; i++) {
        // System.out.println(words[i]);
        // }

        int freq1 = 0;
        String max_word = " ";

        for (int i = 0; i < words.length; i++) {
            int freq = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    freq = freq + 1;
                }
            }
            if (freq > freq1) {
                freq1 = freq;
                max_word = words[i];
            }
        }
        System.out.println("The most repeated word is: " + max_word);
        System.out.println("Its count is: " + freq1);
        return freq1;

    }

    static void least_repeated_words(String z, int len, int max_freq) {

        String[] words = z.split("\\s+");

        // for (int i = 0; i < words.length; i++) {
        // System.out.println(words[i]);
        // }

        int freq1 = max_freq;
        String min_word = " ";

        for (int i = 0; i < words.length; i++) {
            int freq = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    freq = freq + 1;
                }
            }
            if (freq < freq1) {
                freq1 = freq;
                min_word = words[i];
            }
        }
        System.out.println("The least repeated word is: " + min_word);
        System.out.println("Its count is: " + freq1);

    }

    static int most_characters(String z, int len) {

        int freq = 0;
        char maxc = ' ';

        for (int i = 0; i < len; i++) {

            Character c = z.charAt(i);
            int count = 1;

            for (int j = (i + 1); j < len; j++) {
                Character d = z.charAt(j);
                if (c == d) {
                    count = count + 1;
                }
            }

            if (count > freq) {
                freq = count;
                maxc = c;

            }
        }

        System.out.println("The most repeated character: " + maxc);
        System.out.println("Its frequency: " + freq);
        return freq;

    }

    static void least_characters(String z, int len, int max_char) {

        int freq = max_char;
        char minc = ' ';

        for (int i = 0; i < len; i++) {

            Character c = z.charAt(i);
            int count = 1;

            for (int j = (i + 1); j < len; j++) {
                Character d = z.charAt(j);
                if (c == d) {
                    count = count + 1;
                }
            }

            if (count < freq) {
                freq = count;
                minc = c;

            }
        }

        System.out.println("The least repeated character: " + minc);
        System.out.println("Its frequency: " + freq);

    }

}
