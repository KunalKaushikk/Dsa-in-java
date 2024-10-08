import java.util.*;

public class twosum {
    public static void indices(int[] arr, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int indx1 = 0, indx2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(target - arr[i])) {
                indx1 = hash.get(target - arr[i]);
                indx2 = i;
                break;
            } else {
                hash.put(arr[i], i);
            }
        }
        System.out.println(indx1 + " " + indx2);
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 7, 9, 14, 2 };
        int target = 17;
        indices(arr, target);
    }
}
