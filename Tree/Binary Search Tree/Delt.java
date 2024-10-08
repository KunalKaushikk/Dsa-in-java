import java.util.*;
//Important

// Delete node is-
// 1] Leaf (No child)
// 2] Node with one child
// 3] Node with two child
public class Delt {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

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

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (val > root.data) {
            root.right = delete(root.right, val);
        } else if (val < root.data) {
            root.left = delete(root.left, val);
        } else {// root.data==val
                // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3: Get the minimum value
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node InorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildTree(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        if (search(root, 5)) {
            System.out.println("Exist");
        } else {
            System.out.println("Doesn't exist");
        }
        delete(root, 10);
        Inorder(root);
    }
}