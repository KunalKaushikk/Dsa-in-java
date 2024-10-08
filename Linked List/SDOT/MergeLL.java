import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLL {
    // Merge 2 sorted LL and return sorted LL

    public static Node Merge2LL(Node L1, Node L2) {
        Node newNode = new Node(0);
        Node current = newNode; // current or head same
        while (L1 != null && L2 != null) {
            if (L1.data < L2.data) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
            current = current.next;
        }
        if (L1.next != null) {
            current.next = L1;
        } else {
            current.next = L2;
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1st list");
        int m = sc.nextInt();
        System.out.println("Enter elements of L1");
        Node l1 = createLinkedList(sc, m);
        System.out.println("Size of 2nd List");
        int n = sc.nextInt();
        System.out.println("Enter elements of L2");
        Node l2 = createLinkedList(sc, n);
        Node mergNode = Merge2LL(l1, l1);
        while (mergNode != null) {
            System.out.println(mergNode.data + " ");
            mergNode = mergNode.next;
        }
    }

    private static Node createLinkedList(Scanner sc, int length) {
        Node newNode = new Node(0);
        Node current = newNode;
        for (int i = 0; i < length; i++) {
            int data = sc.nextInt();
            current.next = new Node(data);
            current = current.next;
        }
        return newNode.next;
    }
}
