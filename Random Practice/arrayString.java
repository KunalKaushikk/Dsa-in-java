import java.util.*;

public class arrayString {
    public static void main(String[] args) {
        String str = "Tony";
        StringBuilder s = new StringBuilder(str);
        s.insert(0, 'S');
        System.out.println(s);
        s.delete(0, 2);
        System.out.println(s);
        s.delete(3, 4);
        System.out.println(s);

        s.append('S');

        System.out.println(s);
    }
}