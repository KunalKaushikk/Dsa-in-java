import java.util.*;

public class mirrorOFBST {
    // print mirror image of BST
    // After that print Inorder of that mirror image
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static Node buildTree(Node root, int val) {
    // if (root == null) {
    // root = new Node(val);
    // return root;
    // }
    // if (root.data > val) {
    // root.left = buildTree(root.left, val);
    // } else {
    // root.right = buildTree(root.right, val);
    // }
    // return root;
    // }
    public static Node Mirror(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.left = Mirror(root.left, val);
        } else {
            root.right = Mirror(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 1, 2, 5, 3, 4, 6 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Mirror(root, values[i]);
        }
        Inorder(root);
        System.out.println();
    }
}
