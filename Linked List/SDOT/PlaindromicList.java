import java.util.*;
// import java.lang.*;
import java.io.*;

public class PlaindromicList {
    // Given a singly linked list of characters, write a function that returns true
    // if the given list is a palindrome, else false
    class Node {
        int data;
        Node next;

        Node(int data) {
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
        Node prevNode = null;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public void isPalindrom() {
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
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        PlaindromicList slist = new PlaindromicList();
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] numbersStr = input.split("\\s+");
        for (String numStr : numbersStr) {
            int num = Integer.parseInt(numStr);
            slist.addNode(num);
        }
        slist.isPalindrom();
    }
}
