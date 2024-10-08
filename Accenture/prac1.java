import java.util.*;

public class prac1 {
    public static int CheckPass(String str, int n) {
        int count = 0;
        int count1 = 0;
        if (n < 4) {
            return 0;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
            }
            if (str.charAt(i) >= 'A' || str.charAt(i) <= 'Z') {
                count++;
            }
            if (str.charAt(i) >= '0' || str.charAt(i) <= '9') {
                count1++;
            }
        }
        if (count >= 1 && count1 >= 1)

        {
            System.out.println("True");
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(CheckPass(str, str.length()));
    }
}
