import java.util.*;

public class Singly1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("5");
        list.addFirst("is");
        System.out.println(list); // [5, is]

        list.addLast("Java");
        System.out.println(list); // [Java, 5, is]
        list.remove(1);
        System.out.println(list);
    }

}
