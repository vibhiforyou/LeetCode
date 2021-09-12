package leetcode.problems.easy.PathSum;

import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;

        int sum=0;
        return checkTargetSum(root,targetSum,sum);
    }

    private boolean checkTargetSum(TreeNode root,int targetSum,int sum){
        if(root==null)
        {
            return false;
        }
        sum+=root.val;
        if(root.left==null && root.right==null)         //leaf node condition check
        {
            if(sum==targetSum)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        boolean leftResult=checkTargetSum(root.left,targetSum,sum);
        boolean rightResult=checkTargetSum(root.right,targetSum,sum);

        return leftResult||rightResult;
    }

}
class Main{
    public static void main(String... args){

        TreeNode t41= new TreeNode(7,null,null);
        TreeNode t42= new TreeNode(2,null,null);
        TreeNode t46= new TreeNode(1,null,null);

        TreeNode t31= new TreeNode(11,t41,t42);
        TreeNode t33= new TreeNode(13,null,null);
        TreeNode t34= new TreeNode(4,null,t46);

        TreeNode t21= new TreeNode(4,t31,null);
        TreeNode t22= new TreeNode(8,t33,t34);

        TreeNode t11= new TreeNode(5,t21,t22);


        Solution solution= new Solution();
        System.out.println(solution.hasPathSum(t11,22));
    }
}
