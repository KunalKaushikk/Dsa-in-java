import java.util.*;

//Stores pair
//key - value
// roll no  name  (roll no = key, unique)
// 64      shraddha
// 65      rajat
// 66      kunal
// 78      aman
// 89      priya
public class hashmap {
    public static void main(String[] args) {

        // country (key) popolation (value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        map.put("China", 180);// Updated, not twice, unique key only
        // System.out.println(map);

        // // Search
        // // key exists or not?
        // if (map.containsKey("China")) {
        // System.out.println("Exists");
        // } else {
        // System.out.println("Doesn't exists");
        // }
        // if (map.containsKey("Japan")) {
        // System.out.println("Exists");
        // } else {
        // System.out.println("Doesn't exists");
        // }

        // // Gives key for the value
        // System.out.println(map.get("China"));
        // System.out.println(map.get("Japan"));
        // // gives null if doesn't exists

        // // Iterations in HashMap
        // // for(int i=0;i<10;i++){
        // // } another format to use loop or iterate
        // // for(int val: arr){
        // // System.out.print(val) directly prints value of array
        // // }

        // int arr[] = { 12, 15, 28 };
        // for (int i = 0; i < 3; i++) {
        // System.out.println(arr[i] + " ");
        // }
        // System.out.println();

        // for (int val : arr) {
        // System.out.println(val + " ");
        // }
        // System.out.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
    }
}
