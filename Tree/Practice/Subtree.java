import java.util.*;

//Recursion
//Level vise
//        1
//      2   3     
//   4   5    6     subtree =  5       
//  7   8  9   10             8 9

//Logic and psuedocode only
// Interview question with testcase given
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Subtree {
    public boolean isIdentical(TreeNode root, TreeNode subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null || subroot == null) {
            return false;
        }
        if (root.val == subroot.val) {
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.val == subroot.val) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {

    }
}