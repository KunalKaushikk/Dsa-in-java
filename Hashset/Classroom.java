import java.util.*;

public class Classroom {
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tick.keySet()) {
            // key- key; val - tick.get(key)
            revMap.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");

        String start = getStart(ticket);

        while (ticket.containsKey(start)) {
            System.out.println(start);
            start = ticket.get(start);
        }
        System.out.println(start);
    }
}
