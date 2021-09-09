package leetcode.problems.easy.SymmetricTree;

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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode lNode, TreeNode rNode){
        if(lNode==null && rNode==null){
            return true;
        }
        if(lNode==null || rNode==null){
            return false;
        }
        if(lNode.val!= rNode.val){
            return false;
        }

        return isSymmetric(lNode.left,rNode.right) && isSymmetric(rNode.left,lNode.right);

    }
}

class Main {
    public static void main(String... args) {
        TreeNode l311= new TreeNode(3,null,null);
        TreeNode l312= new TreeNode(4,null,null);
        TreeNode l313= new TreeNode(4,null,null);
        TreeNode l314= new TreeNode(3,null,null);

        TreeNode l211= new TreeNode(2,l311,l312);
        TreeNode l212= new TreeNode(2,l313,l314);

        TreeNode root= new TreeNode(1,l211,l212);

        Solution solution= new Solution();
        System.out.println(solution.isSymmetric(root));

    }

}
