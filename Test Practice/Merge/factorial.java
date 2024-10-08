import java.util.*;

public class factorial {
    static int fact(int m) {
        if (m == 0) {
            return 1;
        }
        return (m * fact(m - 1));
    }

    static int nCr(int m, int n) {
        return (fact(m) / (fact(n) * (fact(m - n))));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(fact(5));
        System.out.println("nCr");
        System.out.println(fact(5) / (fact(2) * fact(3)));
        System.out.println(nCr(5, 2));

        // pascal triangle
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(nCr(i - 1, j - 1) + " ");
        // }
        // System.out.println();
        // }
        int n = s.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == 0) {
                    System.out.println("1");
                }
                l.add(nCr(i - 1, j - 1));
                System.out.print(l + " ");
            }
        }
    }
}
