import java.util.*;

class Singly {

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private node head;

    // Constructor
    Singly() {
        head = null;
    }

    // add node/value at first
    public void add_first(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void add_last(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node current_node = head;
        while (current_node.next != null) {
            current_node = current_node.next;
        }
        current_node.next = newNode;
        newNode.next = null;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node current_node = head;
        while (current_node != null) {
            System.out.print(current_node.data + "->");
            current_node = current_node.next;
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
    public void delete_last() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Linked list
        Singly li = new Singly();
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
                    li.add_first(val1);
                    break;
                case 2:
                    System.out.print("Enter value to add at last: ");
                    int val2 = scanner.nextInt();
                    li.add_last(val2);
                    break;
                case 3:
                    li.deleteFirst();
                    break;
                case 4:
                    System.out.println("Deleted");
                    li.delete_last();
                    break;
                case 5:
                    System.out.println("Current list:");
                    li.printlist();
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
