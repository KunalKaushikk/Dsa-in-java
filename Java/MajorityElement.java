import java.util.*;

public class MajorityElement {
    public static int majority(int arr[]) {
        int n = arr.length;
        int count = 1;
        int candidate = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        count = 0;
        for (int ele : arr) {
            if (ele == candidate) {
                count++;
            }
        }
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 5, 5, 5, 4, 7, 8, 2, 1, 4, 5, 3, 6, 8, 5, 5, 5, 5, 5, 5, 5 };
        System.out.println(majority(arr));
    }
}
