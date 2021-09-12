package leetcode.problems.easy.BinaryTreePreorderTraversal;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    public void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

}

class Main {
    public static void main(String... args) {
        TreeNode l31 = new TreeNode(3, null, null);
        TreeNode l21 = new TreeNode(2, l31, null);
        TreeNode l11 = new TreeNode(1, null, l21);

        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(l11);

        for (int element : result
        ) {
            System.out.println(element);
        }

    }
}
