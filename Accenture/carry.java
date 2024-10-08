import java.util.*;

public class carry {
    public static int CarrySum(int a, int b) {
        int carries = 0;
        while (a > 0 && b > 0) {
            int carry = 0;
            int temp1 = a % 10;
            int temp2 = b % 10;
            if (temp1 + temp2 + carry > 9) {
                carry = 1;
                carries++;
            }
            a = a / 10;
            b = b / 10;
        }
        return carries;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(CarrySum(a, b));
    }
}
