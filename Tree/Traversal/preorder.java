import java.util.*;
//Recursion
//Root Left Right
//     1
//   2   3
//  4 5   6 order = 1,2,4,5,3,6

public class preorder {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Bintree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void printPre(Node root) {
        if (root == null) {
            return; // We can print -1 also
        }
        System.out.print(root.data + " ");
        printPre(root.left);
        printPre(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Bintree.buildTree(nodes);
        printPre(root);
    }
}
