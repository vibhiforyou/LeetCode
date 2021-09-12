package leetcode.problems.easy.FlattenBinaryTreetoLinkedList;

import com.sun.source.tree.Tree;

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
    public void flatten(TreeNode root) {
        if(root==null) return;

        TreeNode leftTemp=root.left;
        TreeNode rightTemp =root.right;
        root.left=null;
        flatten(leftTemp);
        flatten(rightTemp);
        root.right=leftTemp;
        TreeNode currentNode=root;
        while(currentNode.right!=null) currentNode=currentNode.right;
        currentNode.right=rightTemp;
    }
}

class Main {
    public static void main(String... args) {

    }
}