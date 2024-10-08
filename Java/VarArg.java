import java.util.*;

public class VarArg {
    public static int SumOfAll(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(SumOfAll(5, 10, 15, 20));
    }
}
