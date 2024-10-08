import java.util.*;

public class Union {
    public static int unionOfarr(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        return set.size(); // calling without sout will not print return statement
    }

    public static void main(String[] args) {
        int num1[] = { 1, 2, 3, 4 };
        int num2[] = { 5, 6, 7, 2 };
        System.out.println(unionOfarr(num1, num2));
    }
}
