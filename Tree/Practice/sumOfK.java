import java.util.*;

//Recursion
//Level vise
//     1
//   2   3
//  4 5   6 order = 1,2,3,4,5,6
//Will use FIFO (Queue)

//Left Root Right
public class sumOfK {

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

    public static int Sum(Node root, int k) {

        if (root == null || k < 0) {
            return 0;
        }
        if (k == 0) {
            return root.data;
        }

        return Sum(root.left, k - 1) + Sum(root.right, k - 1) + root.data;
    }

    public static void printLevel(Node root) {
        if (root == null) {
            System.out.println("Empty tree");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1, -1 };
        Node root = Bintree.buildTree(nodes);
        printLevel(root);
        System.out.println(Sum(root, 1));
    }
}