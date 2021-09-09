package leetcode.problems.easy.SameTree;

import com.sun.source.tree.Tree;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null)
        {
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

class Main {

    public static void main(String... args) {
        TreeNode l12 = new TreeNode(2, null, null);
        TreeNode l13 = new TreeNode(3, null, null);
        TreeNode l0root = new TreeNode(1, l12, l13);

        TreeNode r12 = new TreeNode(2, null, null);
        TreeNode r13 = new TreeNode(1, null, null);
        TreeNode r0root = new TreeNode(1, r12, r13);

        Solution solution = new Solution();
        boolean result = solution.isSameTree(l0root, r0root);
        System.out.println(result);

    }
}
