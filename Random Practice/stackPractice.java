import java.util.Scanner;

public class stackPractice {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stk {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1; // Indicate stack underflow
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1; // Indicate stack underflow
            }
            int top = head.data;
            return top;
        }

        public static void print() {
            if (isEmpty()) {
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int data;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    data = sc.nextInt();
                    Stk.push(data);
                    break;
                case 2:
                    int popped = Stk.pop();
                    if (popped == -1)
                        System.out.println("Stack is empty. Cannot pop.");
                    else
                        System.out.println("Popped element: " + popped);
                    break;
                case 3:
                    int peeked = Stk.peek();
                    if (peeked == -1)
                        System.out.println("Stack is empty. Cannot peek.");
                    else
                        System.out.println("Top element: " + peeked);
                    break;
                case 4:
                    System.out.println("Elements in stack");
                    Stk.print();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);
        sc.close();
    }
}

// import java.util.*;

// // public class stack {
// // class stk {
// // static ArrayList<Integer> list = new ArrayList<>();

// // public static boolean isEmpty() {
// // return list.size() == 0;
// // }

// // public static void push(int data) {
// // list.add(data);
// // }

// // public static int pop() {
// // if (isEmpty()) {
// // return -1;
// // }
// // int top = list.get(list.size() - 1);
// // list.remove(list.size() - 1);
// // return top;
// // }

// // public static int peek() {
// // if (isEmpty()) {
// // return -1;
// // }
// // return list.get(list.size() - 1);
// // }
// // }

// // public static void main(String[] args) {

// // stk.push(1);
// // stk.push(2);
// // stk.push(3);
// // stk.push(4);

// // while (!stk.isEmpty()) {
// // System.out.print(stk.peek() + " ");
// // stk.pop();
// // }
// // }
// //}

// //-----Online test-----
// public class stackPractice {
// public static void main(String[] args) {
// Stack<Integer> stk = new Stack<>();

// stk.push(1);
// stk.push(2);
// stk.push(3);
// stk.push(4);

// while (!stk.isEmpty()) {
// System.out.print(stk.peek() + " ");
// stk.pop();
// }
// }
// }
