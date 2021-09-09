package leetcode.problems.easy.BinaryTreeInorderTraversal;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

//without recursion
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;


        while(current!=null || !stack.isEmpty()){

            while (current!=null)
            {
                stack.push(current);
                current=current.left;
            }

            current=stack.pop();
            result.add(current.val);
            current=current.right;

        }
        return result;
    }
}

//
class SolutionWithRecursion{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result= new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    public void inOrder(TreeNode root,List<Integer> result){
        if(root!=null){
            if(root.left!=null){
                inOrder(root.left,result);
            }
            result.add(root.val);
            if(root.right!=null){
                inOrder(root.right,result);
            }
        }
    }


}

class Main{
    public static void main(String args[]){
        TreeNode l12= new TreeNode(2,null,null);
        TreeNode root= new TreeNode(1,l12,null);
        /*Solution solution= new Solution();
        List response=solution.inorderTraversal(root);*/

        SolutionWithRecursion solution= new SolutionWithRecursion();
        List<Integer> response=solution.inorderTraversal(root);

        for (Object element :response
             ) {
            System.out.println(element);
        }
    }
}
