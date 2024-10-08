import java.util.*;

public class kSorted {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
        } else {
            head.next = newNode;
            head = newNode;
        }

    }
}
