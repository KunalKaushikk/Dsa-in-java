import java.util.*;

//Subsequence
// public class LCS {
//     static int subseq(String s, String sub) {
//         int len = s.length();
//         HashMap<String, Integer> map = new HashMap<>();
//         int sublen = sub.length();
//         map.put(sub, 0);
//         int count = 0;
//         for (int i = 0; i < len; i++) {
//             if (map.containsKey(sub)) {
//                 count++;
//             }
//         }
//         return count / sublen - 1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter string");
//         String s = sc.nextLine();
//         System.out.println("Enter substring");
//         String sub = sc.nextLine();

//         System.out.println(subseq(s, sub));
//     }

// }

public class LCS {
    static int subseq(String s, String s1) {
        int len = s.length();
        int len1=s1.length();
        int dp[][]=new int[x+1][y+1];
        for(int i=0;i)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Enter substring");
        String s1 = sc.nextLine();

        System.out.println(subseq(s, s1));
    }

}
