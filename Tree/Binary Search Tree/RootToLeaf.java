import java.util.*;

// all path, root left left,
//           root left right,
//           root right left,
//           root right right
//have to print all possible paths
import java.util.*;

//Print in range
// ex numbers between 6 to 10 in tree

// X>Y
// if X<root<Y means both left and right
// if X> root, all numbers are in right
// if Y<root means all are in left
public class RootToLeaf {

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
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
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
}
