import java.util.*;
//Recursion
//Level vise
//     1
//   2   3
//  4 5   6 longest = left most to right most, 5 to 6 also same

//one case is, diameter doesn't pass through root
// ex:          0
//             1
//           2   3
//         4       8
//        5
//       6
//      7   
// O(n^2)
public class Diameter {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int maxheight = Math.max(leftheight, rightheight) + 1;
        return maxheight;
    }

    public static int maxDmtr(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdmtr = maxDmtr(root.left);
        int rightdmtr = maxDmtr(root.right);
        int dmtr3 = height(root.left) + height(root.right) + 1;
        return Math.max(dmtr3, Math.max(leftdmtr, rightdmtr));
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Bintree.buildTree(nodes);
        System.out.println(maxDmtr(root));
    }
}