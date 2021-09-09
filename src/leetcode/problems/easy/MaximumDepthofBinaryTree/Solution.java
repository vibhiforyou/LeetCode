package leetcode.problems.easy.MaximumDepthofBinaryTree;

import java.time.temporal.Temporal;

class TreeNode {
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

public class Solution {
    int counter = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        if (lh > rh) {
            return lh + 1;
        } else {
            return rh + 1;
        }
    }
}

class Main {
    public static void main(String... args) {

        Solution solution = new Solution();

    }
}

