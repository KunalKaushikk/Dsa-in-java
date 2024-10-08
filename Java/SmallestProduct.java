import java.util.*;

public class SmallestProduct {
    public static int numbers(int n) {
        String ans = "";
        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                n = n / i;
                ans = i + ans;
            }
        }
        if (n != 1) {
            return -1;
        } else {
            return Integer.parseInt(ans);
        }
    }

    public static void main(String[] args) {
        System.out.println(numbers(100));
    }
}
