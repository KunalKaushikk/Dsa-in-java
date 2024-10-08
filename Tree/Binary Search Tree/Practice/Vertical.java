import java.util.*;

public class Vertical {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node head;

    static Node buildTree(Node root, int value) {
        if (root == null) {
            return root;
        }
        if (root.data < value) {
            buildTree(root.right, value);
        } else {
            buildTree(root.left, value);
        }
        return root;
    }

    static void VerticalOrder(Node root) {

    }

    public static void main(String[] args) {
        int values[] = { 2, 4, 5, 7, 3, 6 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            buildTree(root, values[i]);
        }

    }
}
