import java.util.*;

public class Secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr); Shortcut
        // System.out.println(arr[n - 2]);
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second_largest && arr[i] < largest) {
                second_largest = arr[i];
            }
        }
        System.out.println(second_largest);
    }
}
