import java.util.*;

public class fibonacci {

    static int fib(int n) {
        int arr[] = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for fib: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}