import java.util.*;

public class vowel {

    public static void main(String args[]) {

        String sentence;

        Scanner sc = new Scanner(System.in);

        sentence = sc.nextLine();

        char[] s = sentence.toCharArray();

        for (int i = 0; i < s.length - 1; i++) {

            if (isVowel(s[i]) && isVowel(s[i + 1])) {

                System.out.println("The Consecutive vowels are : " + s[i] + "and" + s[i + 1]);

            }

        }

    }

    static Boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')

            return true;

        else

            return false;

    }

}