import java.util.*;

public class rats {
    public static int mul(int r, int u, int arr[], int n) {
        int p = r * u;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            if (sum >= p) {
                break;
            }
        }
        System.out.print("The required houses are: ");
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int u = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(mul(r, u, arr, n));

    }
}
