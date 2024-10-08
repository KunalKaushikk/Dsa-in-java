import java.util.Scanner;

public class IntegerPalindrome {
    public static boolean isPalindrome(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                System.out.println("Not palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        isPalindrome(arr);
        sc.close();
    }
}
