import java.util.*;

class Reverse {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor
    Reverse() {
        head = null;
    }

    // add node/value at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Reversing the list
    public int getSize() {
        return size;
    }

    public void reverseIterate() {

        if (head == null || head.next == null)
            return;
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Linked list
        Reverse li = new Reverse();
        System.out.println("Adding nodes to the linked list:");
        int choice;
        do {
            System.out.println("1. Add node at first");
            System.out.println("2. Add node at last");
            System.out.println("3. Delete first node");
            System.out.println("4. Delete last node");
            System.out.println("5. Print list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at first: ");
                    int val1 = scanner.nextInt();
                    li.addFirst(val1);
                    break;
                case 2:
                    System.out.print("Enter value to add at last: ");
                    int val2 = scanner.nextInt();
                    li.addLast(val2);
                    break;
                case 3:
                    li.deleteFirst();
                    break;
                case 4:
                    System.out.println("Deleted");
                    li.deleteLast();
                    break;
                case 5:
                    System.out.println("Current list:");
                    li.printList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        scanner.close();
    }
}