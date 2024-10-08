import java.util.*;

public class codeforeces {

    static boolean midPoint(int arr[], int n) {
        int i = arr[0];
        for (int k = i + 1; k < arr.length; k++) {
            if ((k + i) / 2 == 0) {
                System.out.println("Yes");
                return true;
            }
        }
        System.out.println("No");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {
            int k = sc.nextInt();
            int arr[] = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }
            midPoint(arr, k);
        }
    }
}
