package leetcode.problems.easy.MinimumDepthofBinaryTree;

import com.sun.source.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode() {
    }
}

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int lh = minHeightOfCurrentNode(root.left);
        int rh = minHeightOfCurrentNode(root.right);

        if(lh==0)
        {
            return rh+1;
        }
        if(rh==0)
        {
            return lh+1;
        }

        if (lh < rh) {
            return lh+1;
        } else {
            return rh+1;
        }
    }

    public int minHeightOfCurrentNode(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.right != null) {
            int lh = minHeightOfCurrentNode(root.left);
            int rh = minHeightOfCurrentNode(root.right);

            if (lh < rh) {
                return lh + 1;
            } else {
                return rh + 1;
            }
        }
        if (root.left == null) {
            return minHeightOfCurrentNode(root.right)+1;
        } else {
            return minHeightOfCurrentNode(root.left)+1;
        }
    }
}

class Main {
    public static void main(String... args) {

        //Example
        TreeNode l23 = new TreeNode(15, null, null);
        TreeNode l24 = new TreeNode(7, null, null);

        TreeNode l11 = new TreeNode(9, null, null);
        TreeNode l12 = new TreeNode(20, l23, l24);

        TreeNode root = new TreeNode(3, l11, l12);

        Solution solution = new Solution();
        System.out.println(solution.minDepth(root));


        //Example2
//        TreeNode m51 = new TreeNode(6, null, null);
//        TreeNode m41 = new TreeNode(5, null, m51);
//
//        TreeNode m31 = new TreeNode(4, null, m41);
//        TreeNode m21 = new TreeNode(3, null, m31);
//
//        TreeNode root1 = new TreeNode(2, null, m21);
//
//        Solution solution1 = new Solution();
//        System.out.println(solution1.minDepth(root1));


    }
}