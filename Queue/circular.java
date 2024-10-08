import java.util.*;

public class circular {
    static class qu {
        static int arr[];
        static int size;
        static int rear = -1; // front = 0 always
        static int front = -1;

        qu(int n) {
            arr = new int[n];
            qu.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enque(int data) {
            if (isFull()) {
                System.out.println("Queue is Full!");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        qu q = new qu(5); // Assuming size of the queue is 5
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        System.out.print(q.remove() + " ");
        q.enque(6);
        System.out.print(q.remove() + " ");
        q.enque(7);
        // 1 2 3 ... 1 2 3
        while (!qu.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println(); // New line after printing all elements
    }
}
