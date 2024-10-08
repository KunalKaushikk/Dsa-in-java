import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // Ensuring the next node is initialized as null.
    }
}

public class Sorted {
    // Merges two sorted linked lists into a single sorted linked list.
    public static Node mergeLinkedList(Node l1, Node l2) {
        Node dummyNode = new Node(0); // Temporary dummy node to start the merged list.
        Node current = dummyNode; // Pointer to build the new list.

        // While both lists have elements, merge them based on their values.
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next; // Move to the next element in the merged list.
        }

        // Attach the remaining elements, if any.
        current.next = (l1 != null) ? l1 : l2;

        return dummyNode.next; // Return the start of the merged list, skipping the dummy node.
    }

    // Helper method to create a linked list from user input.
    private static Node createLinkedList(Scanner sc, int length) {
        Node dummy = new Node(0); // Dummy node to simplify list creation.
        Node current = dummy;
        for (int i = 0; i < length; i++) {
            int data = sc.nextInt();
            current.next = new Node(data);
            current = current.next;
        }
        return dummy.next; // Return the real head of the list, skipping the dummy.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of 1st list");
        int n = sc.nextInt(); // Length of the first list.
        Node l1 = createLinkedList(sc, n); // Creating the first list.
        System.out.println("Length of 2nd list");
        int m = sc.nextInt(); // Length of the second list.
        Node l2 = createLinkedList(sc, m); // Creating the second list.

        Node merged = Sorted.mergeLinkedList(l1, l2); // Merging the lists.

        // Printing the merged list.
        while (merged != null) {
            System.out.print(merged.data + " ");
            merged = merged.next;
        }
    }
}
