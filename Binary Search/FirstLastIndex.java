import java.util.*;

public class FirstLastIndex {
    class Solution {
        public static void sortColors(int[] nums) {
            int zero = 0;
            int one = 0;
            int two = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zero++;
                } else if (nums[i] == 1) {
                    one++;
                } else {
                    two++;
                }

            }
            for (int i = 0; i < zero; i++) {
                System.out.println(0 + " ");
            }
            for (int i = 0; i < one; i++) {
                System.out.print(1 + " ");
            }
            for (int k = 0; k < two; k++) {
                System.out.print(2 + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 0, 1, 2, 0, 1 };
        sortColors(arr);
    }
}
