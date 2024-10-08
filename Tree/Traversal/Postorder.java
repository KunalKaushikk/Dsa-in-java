import java.util.*;

//Recursion
//Left Right Root
//     1
//   2   3
//  4 5   6 order = 4,5,2,6,3,1

//Left Root Right
public class Postorder {
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

    public static void Printpost(Node root) {
        if (root == null) {
            return;
        }
        Printpost(root.left);
        Printpost(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Bintree.buildTree(nodes);
        Printpost(root);
    }
}
