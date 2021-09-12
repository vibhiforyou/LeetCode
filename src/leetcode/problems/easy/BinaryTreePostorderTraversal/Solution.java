package leetcode.problems.easy.BinaryTreePostorderTraversal;

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            postOrder(root.left, result);
        }
        if (root.right != null) {
            postOrder(root.right, result);
        }
        result.add(root.val);

    }
}

class Main {
    public static void main(String... args) {
        TreeNode t31 = new TreeNode(3, null, null);
        TreeNode t22 = new TreeNode(2, t31, null);
        TreeNode t11 = new TreeNode(1, null, t22);
        Solution solution = new Solution();
        List<Integer> result = solution.postorderTraversal(t11);

        for (int element : result
        ) {
            System.out.println(element);
        }
    }
}
