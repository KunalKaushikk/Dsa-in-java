import java.util.*;

// public class queLL {

//     static class node {
//         int data;
//         node next;

//         public node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static node head;
//     static node tail;

//     static class qu {
//         public boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         public void enque(int data) {
//             node newnode = new node(data);
//             if (tail == null) {
//                 tail = head = newnode;
//             } else {
//                 tail.next = newnode;
//                 tail = newnode;
//             }
//         }

//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int front = head.data;
//             head = head.next;
//             if (head == null) {
//                 tail = null;
//             }
//             return front;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         qu q = new qu();
//         q.enque(1);
//         q.enque(2);
//         q.enque(3);
//         q.enque(4);
//         q.enque(5);

//         while (!q.isEmpty()) {
//             System.out.print(q.peek() + " ");
//             q.remove();
//         }
//         System.out.println();
//     }
// }

//Framework

public class queLL {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1); // add , isEmpty, peek, remove all same
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}

// Queue(FIFO) using 2 stack(LIFO)
// 2 ways but can't do in O(1) time complexity