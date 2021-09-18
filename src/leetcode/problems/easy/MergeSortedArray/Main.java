package leetcode.problems.easy.MergeSortedArray;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[m];

        for (int q = 0; q < m; q++) {
            output[q] = nums1[q];
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (output[i] < nums2[j]) {
                nums1[k] = output[i];
                k++;
                i++;
            } else {
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            nums1[k] = output[i];
            i++;
            k++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}

public class Main {
    public static void main(String... args) {
        Solution solution = new Solution();
        int[] input = new int[]{1, 3, 5, 8,0,0,0,0,0,0};
        solution.merge(input, 4, new int[]{4, 6, 8, 10, 12,14}, 6);

        for (int element : input
        ) {
            System.out.println(element);
        }

    }
}
