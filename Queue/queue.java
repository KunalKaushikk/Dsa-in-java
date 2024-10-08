import java.util.*;

public class queue {
    static class qu {
        int arr[];
        int size;
        int rear = -1; // front = 0 always

        qu(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void enque(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full!");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
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
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println(); // New line after printing all elements
    }
}
