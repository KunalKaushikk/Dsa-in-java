import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr1[] = { 1, 2, 3, 5, 8 };
        int arr2[] = { 4, 6, 9, 10, 11 };
        int a = arr1.length;
        int b = arr2.length;
        int arr3[] = new int[a + b];
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < a)
            arr3[k++] = arr1[i++];
        while (j < b)
            arr3[k++] = arr2[j++];

        // Print the merged array
        for (int w = 0; w < a + b; w++) {
            System.out.print(arr3[w] + " ");
        }
        System.out.println();

        System.out.println(Math.abs(6 - 10));
    }
}
