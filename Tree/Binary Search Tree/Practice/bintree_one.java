import java.util.*;

public class bintree_one {
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

    public static Node buildTree(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = buildTree(root.left, value);
        } else {
            root.right = buildTree(root.right, value);
        }
        return root;
    }

    // static void Inorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // Inorder(root.left);
    // System.out.println(root.data);
    // Inorder(root.right);
    // }

    // Boundary traversal, left, right, leaf, node

    // All leftmost, all right most, the one whose left and right null in between
    static void Boundaryleaf(Node root) {
        if (root == null) {
            return;
        }
        Boundaryleaf(root.left);
        if (root.left == null && root.right == null) {
            System.out.println(root.data);
        }
        Boundaryleaf(root.right);
    }

    static void Boundaryleft(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            System.out.println(root.data);
            Boundaryleft(root.left);
        } else if (root.right != null) {
            System.out.println(root.right);
            Boundaryleft(root.right);
        }
    }

    static void Boundaryright(Node root) {
        if (root.right != null) {
            System.out.println(root.data);
            Boundaryright(root.right);
        } else if (root.left != null) {
            System.out.println(root.data);
            Boundaryleft(root.left);
        }
    }

    static void BoundaryNode(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);

        // Left boundary top to down
        Boundaryleft(root.left);
        // All leaf
        Boundaryleaf(root.left);
        Boundaryleaf(root.right);
        // Boundary right bottom up
        Boundaryright(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 20, 8, 4, 10, 14, 25, 22 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildTree(root, values[i]);
        }

        // Inorder(root);
        BoundaryNode(root);
    }
}