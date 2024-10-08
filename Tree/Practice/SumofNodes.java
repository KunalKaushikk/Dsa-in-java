import java.util.*;

//Recursion
//Level vise
//     1
//   2   3
//  4 5   6 order = 1,2,3,4,5,6
//Will use FIFO (Queue)

//Left Root Right
public class SumofNodes {
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

    public static int Sum(Node root) {

        if (root == null) {
            return 0;
        }
        int leftsum = Sum(root.left);
        int rightsum = Sum(root.right);

        return leftsum + rightsum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Bintree.buildTree(nodes);
        System.out.println(Sum(root));
    }
}