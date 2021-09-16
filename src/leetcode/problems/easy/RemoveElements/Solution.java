package leetcode.problems.easy.RemoveElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution {
    int modCount = 0;

    public int removeElement(int[] nums, int val) {
        int modCount=0;
        int n=nums.length;
       for(int i=n-1;i>=0;i--){
           if(nums[i]==val){
               modCount++;
               for(int j=i;j<n-1;j++){
                   int temp=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;
               }
           }
       }
       return n-modCount;
    }
}

class Main {
    public static void main(String args[]) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        Solution solution = new Solution();
        System.out.println("k=" + solution.removeElement(nums, 2));
        for (int element : nums
        ) {
            System.out.println(element);
        }
    }
}
