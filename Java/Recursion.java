import java.util.*;

public class Recursion {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int nCr(int n, int r) { // 5C4 = 5!/4!*(5-4)!
        if (n == 1 || n == 0) {
            return 1;
        }
        int nOfncr = (n * factorial(n - 1));
        int rOfncr = (factorial(n - r) * factorial(r));
        return nOfncr / rOfncr;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(nCr(3, 2));
        System.out.println(nCr(5, 3));
    }
}
