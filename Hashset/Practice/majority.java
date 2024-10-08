import java.util.*;

public class majority {
    public static void majorityElements(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Now with hashmap

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key + " ");
            }
        }
    }

    public static void main(String[] args) {

        // all emements that occur more than 3 times
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 }; // size = 9
        majority.majorityElements(arr);

        // HashMap<Integer, Integer>
        // ans = 1

        // How to solve?
        // int major_count = 0;

        // for (int i = 0; i < n; i++) {
        // int count = 0;
        // for (int j = 0; j < n; j++) {
        // if (arr[i] == arr[i]) {
        // count++;
        // }
        // }
        // if (count >= maj_size) {
        // major_count++;
        // if (major_count == 1)
        // System.out.println(arr[i]);
        // }
        // }
    }
}
