import java.util.*;

public class LOOPdetefloyd {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    static void pushFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // detect loop
    static void detectLoopAndPrint() {
        Node slow = head, fast = head;
        while (slow != null && fast != null) {
            slow = head.next;
            fast = head.next.next;
            if (slow == fast) {
                System.out.println("Loop detected");
            }
            return;
        }
        System.out.println("Loop not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            pushFirst(data);
        }
        detectLoopAndPrint();
    }
}
