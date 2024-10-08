import java.util.*;

public class Palindrom {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node reverseList(Node temp) {
        Node current = temp;
        Node prevNode = null, nextNode = null;
        while (current != null) {
            nextNode = current.next; // Save next node.
            current.next = prevNode; // Reverse current node's pointer.
            prevNode = current; // Move prevNode one step forward.
            current = nextNode; // Move current one step forward.
        }
        return prevNode; // prevNode now points to the new head of the reversed list.
    }

    public void isPalindrome() {
        Node current = head;
        boolean flag = true;
        int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }
        Node revHead = reverseList(current.next);
        while (head != null && revHead != null) {
            if (head.data != revHead.data) {
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }
        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {

        Palindrom list = new Palindrom();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] numberStr = input.split("\\s+");
        for (String numStr : numberStr) {
            int num = Integer.parseInt(numStr);
            list.addNode(num);
        }
        list.isPalindrome();
    }
}
