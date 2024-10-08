// import java.util.*;

// public class repeatCountprint {
//     //Input abbccc output ab2c5

//     static void countPrint(String s){
//         int len=s.length();
//         int count =0;
//         HashMap<Character,Integer> map= new HashMap<>();

//         for(int i=0;i<len;i++){
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         StringBuilder result = new StringBuilder();
//         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//             result.append(entry.getKey());
//             result.append(entry.getValue());
//         }

//         System.out.println(result.toString());
//     }

//     public static void main(String[] args) {

//     }
// }
import java.util.*;

public class repeatCountprint {
    // Input abbccc output ab2c5

    static void countPrint(String s) {
        int len = s.length();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {

    }
}
