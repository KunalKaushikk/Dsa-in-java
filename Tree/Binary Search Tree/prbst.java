import java.util.*;

public class prbst {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node buildTree(node root, int value) {
        if (root == null) {
            root = new node(value);
            return root;
        }
        if (root.data > value) {
            root.left = buildTree(root.left, value);
        } else {
            root.right = buildTree(root.right, value);
        }
        return root;
    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int value[] = new int[n];
        node root = null;
        for (int i = 0; i < n; i++) {
            value[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            buildTree(root, value[i]);
        }
        inorder(root);
        System.out.println();
    }
}
