import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // System.out.println(rotate(arr, n, k));
        rotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] rotate(int arr[], int n, int k) {
        if (k > n) {
            k = k % n;
        }
        int ans[] = new int[n];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[n - k + i];
        }
        int index = 0;
        for (int i = k; i < n; i++) {
            ans[i] = arr[index++];
        }
        return ans;
    }
}