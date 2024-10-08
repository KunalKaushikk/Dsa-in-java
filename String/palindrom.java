import java.util.*;

public class palindrom {
    public static boolean isPalindrom(String s1) {
        int l = s1.length();
        String rev = "";
        int mid = l % 2 == 0 ? l / 2 - 1 : l / 2;
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        if (s1.equals(rev)) {
            System.out.println("Palindrom");
            return true;
        }
        System.out.println("Not palindrom");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPalindrom(s);
    }
}
