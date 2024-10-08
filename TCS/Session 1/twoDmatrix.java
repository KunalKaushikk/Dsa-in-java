import java.util.*;

public class twoDmatrix {
    // Print in diagonals, decrease row and increase column
    static boolean isValid(int i, int j){
        if(i<0||i>=R|| || )
    }

    static void matrix(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int i = 0, j = 0;
        int k = 0;
        j = k + 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - 1; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        matrix(arr);
    }
}
