import java.util.*;

public class threesum {
    public static void threeUniqueIndices(int[] arr, int target) {
        int ind1, ind2, ind3;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int j = i + 1;
                int k = n - 1;
                int temp = target - arr[i];
                while (j < k) {
                    if (arr[j] + arr[k] == temp) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        while (j < k && arr[j] == arr[j + 1])
                            j++;
                        while (j < k && arr[k] == arr[k - 1])
                            k--;
                        j++;
                        k--;
                    } else if (arr[j] + arr[k] < temp) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, -6, 3, 8, -1, 8, -11 };
        int target = 0;
        threeUniqueIndices(arr, target);
    }
}
