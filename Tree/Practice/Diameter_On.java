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
public class Diameter_On {
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
    // Will calculate height together with diameter
    // public static int height(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int leftheight = height(root.left);
    // int rightheight = height(root.right);

    // int maxheight = Math.max(leftheight, rightheight) + 1;
    // return maxheight;
    // }

    // public static int maxDmtr(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int leftdmtr = maxDmtr(root.left);
    // int rightdmtr = maxDmtr(root.right);
    // int dmtr3 = height(root.left) + height(root.right) + 1;
    // return Math.max(dmtr3, Math.max(leftdmtr, rightdmtr));
    // }

    public static class treeInfo {
        int ht;
        int dmtr;

        treeInfo(int ht, int dmtr) {
            this.ht = ht;
            this.dmtr = dmtr;
        }
    }

    public static treeInfo diameter2(Node root) {

        if (root == null) {
            return new treeInfo(0, 0);
        }

        treeInfo left = diameter2(root.left);
        treeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;
        int dmtr1 = left.dmtr;
        int dmtr2 = right.dmtr;
        int dmtr3 = (left.ht + right.ht) + 1;

        int mydmtr = Math.max(Math.max(dmtr1, dmtr2), dmtr3);

        treeInfo myInfo = new treeInfo(myHeight, mydmtr);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Bintree.buildTree(nodes);
        System.out.println(diameter2(root).dmtr);
    }
}