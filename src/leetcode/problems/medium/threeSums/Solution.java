package leetcode.problems.medium.threeSums;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n-2; i++) {
            int leftIndex = i + 1;
            int rightIndex = n - 1;

            while (leftIndex < rightIndex) {
                int sum = nums[i] + nums[leftIndex] + nums[rightIndex];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[leftIndex++]);
                        temp.add(nums[rightIndex--]);
                        set.add(temp);

                } else {
                    if (sum <= 0) {
                        leftIndex++;
                    } else {
                        rightIndex--;
                    }
                }
            }
        }
        return new ArrayList(set);
    }


}


class MainCLass {
    public static void main(String... args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{0, 3, 0, 1, 1, -1, -5, -5, 3, -3, -3, 0});
        for (List<Integer> list : result) {
            System.out.print("[");
            for (Integer element : list
            ) {
                System.out.print(element + ",");
            }
            System.out.print("]");
        }
    }
}
