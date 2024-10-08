import java.util.*;

class LL {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private node head; // head

    LL() {
        head = null;
    }

    // Insertion
    void insertAtHead(int x) {
        node nn = new node(x);
        if (head == null) {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    void addLast(int x) {
        node nn = new node(x);
        if (head == null) {
            head = nn;
            return;
        }
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = nn;
        nn.next = null;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }

    void delete_last() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void print() {
        node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete nth node from last or first
    void delete(int k) {
        if (head == null || k <= 0)
            return;

        // Find the size of the list
        int size = 0;
        node nn = head;
        while (nn != null) {
            nn = nn.next;
            size++;
        }

        // Calculate the index to search
        int index_to_search = size - k;

        // Traverse to the node just before the node to be deleted
        node temp = head;
        for (int i = 1; i < index_to_search && temp != null; i++) {
            temp = temp.next;
        }

        // If the node is null or if it's the last node, do nothing
        if (temp == null || temp.next == null)
            return;

        // Delete the node
        temp.next = temp.next.next;
    }
}

public class nthNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL linkedList = new LL();

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert at head");
            System.out.println("2. Insert at last");
            System.out.println("3. Delete first node");
            System.out.println("4. Delete last node");
            System.out.println("5. Print list");
            System.out.println("6. Delete nth node from last");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at head: ");
                    int val1 = sc.nextInt();
                    linkedList.insertAtHead(val1);
                    break;
                case 2:
                    System.out.print("Enter value to insert at last: ");
                    int val2 = sc.nextInt();
                    linkedList.addLast(val2);
                    break;
                case 3:
                    linkedList.deleteFirst();
                    break;
                case 4:
                    linkedList.delete_last();
                    break;
                case 5:
                    System.out.println("Current list:");
                    linkedList.print();
                    break;
                case 6:
                    System.out.print("Enter the position from last to delete: ");
                    int pos = sc.nextInt();
                    linkedList.delete(pos);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
