import java.util.*;

public class LoopDet {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            next = null;
            data = d;
        }
    }

    static Node head;

    public static void pushAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static boolean detectLoop(Node h) {
        HashSet<Node> set = new HashSet<>();
        while (h != null) {
            if (set.contains(h)) {
                return true;
            }
            set.add(h);
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            pushAtFirst(data);
        }

        // Detect loop
        boolean hasLoop = detectLoop(head);
        if (hasLoop) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        sc.close();
    }
}
