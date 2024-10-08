import java.util.*;

public class Intersection {
    public static int inter(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int count = 0;
        // 7,3,9 6,3,9,2,9,4 ans = 3,9
        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set1.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.print("Size ");
        return count;
    }

    public static void main(String[] args) {
        int num1[] = { 7, 3, 9 };
        int num2[] = { 6, 3, 9, 2, 9, 4 };
        System.out.print(inter(num1, num2));
    }
}
