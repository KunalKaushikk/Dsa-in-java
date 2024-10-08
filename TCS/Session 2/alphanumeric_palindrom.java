import java.util.*;

public class alphanumeric_palindrom {
    // all , upper case, lower case, signs included
    static void palindrom(String s) {
        int len = s.length();

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= 0; j++) {
                if (s.charAt(i) == s.charAt(j)) {

                }
            }
        }
    }
}
