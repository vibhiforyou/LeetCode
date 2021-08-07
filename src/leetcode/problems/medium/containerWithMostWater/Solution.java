package leetcode.problems.medium.containerWithMostWater;

import java.util.Map;

public class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int left = 0, right = height.length - 1;
        int area = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                int newarea = height[left] * (right - left);
                if (area<newarea) {
                    area= newarea;
                }
                left++;
            } else {
                int newarea = height[right] * (right - left);
                if(area<newarea)
                {
                    area=newarea;
                }
                right--;
            }
        }
        return area;
    }
}

class ContainerWithMostwater {
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(solution.maxArea(new int[]{4,3,2,1,4}));
        System.out.println(solution.maxArea(new int[]{1,2,1}));
        System.out.println(solution.maxArea(new int[]{1,1}));
    }
}