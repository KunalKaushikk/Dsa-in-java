import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // stores unique values only

        // search -- contains
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("doesn't contain 1");
        }
        // Delete
        // set.remove(1); removes all value
        // if (!set.contains(1)) {
        // System.out.println("deleted 1");
        // }
        // size
        System.out.println(set.size()); // repeated count 1 only
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
    }
}
