package leetcode.problems.easy.removeDuplicatesfromSortedArray;

import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else
            {
                map.put(nums[i],0);
            }
        }
        int i=0;
        ArrayList<Integer> sortedKeys=new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        for (int key: sortedKeys) {
            nums[i++]=key;
        }
        return  map.keySet().size();
    }
}

class RemoveDuplicatesfromSortedArray {
    public static void main(String... args) {
        Solution solution= new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1,1,2}));
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(solution.removeDuplicates(new int[]{}));
    }
}