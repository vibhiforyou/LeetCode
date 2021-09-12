package leetcode.problems.easy.BalancedBinaryTree;


import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int lh = heightOfCurrentNode(root.left);
        int rh = heightOfCurrentNode(root.right);

        if (lh != rh && Math.abs(lh - rh) != 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int heightOfCurrentNode(TreeNode root) {
        if (root == null)
            return 0;
        int lh = heightOfCurrentNode(root.left);
        int rh = heightOfCurrentNode(root.right);
        if (lh > rh) {
            return lh + 1;
        } else {
            return rh + 1;
        }
    }
}

class Main {
    public static void main(String... args) {
        TreeNode l23 = new TreeNode(15, null, null);
        TreeNode l24 = new TreeNode(7, null, null);

        TreeNode l11 = new TreeNode(9, null, null);
        TreeNode l12 = new TreeNode(20, l23, l24);

        TreeNode root = new TreeNode(3, l11, l12);

        Solution solution = new Solution();
        System.out.println(solution.isBalanced(root));
    }
}


