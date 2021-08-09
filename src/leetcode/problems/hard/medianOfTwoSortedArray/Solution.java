package leetcode.problems.hard.medianOfTwoSortedArray;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        int[] combinedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                combinedArray[k] = nums1[i];
                i++;
                k++;
            } else {
                combinedArray[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < nums1.length) {
            combinedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            combinedArray[k]=nums2[j];
            j++;
            k++;
        }
        for (int element : combinedArray) {
            System.out.println(element);
        }

        if(combinedArray.length%2==0){
            median=(combinedArray[(combinedArray.length/2)-1]+combinedArray[(combinedArray.length/2)])/2.0;
        }
        else
        {
            median=combinedArray[(combinedArray.length/2)];
        }
        return median;
    }
}

class MainClass {
    public static void main(String... args) {
        Solution solution= new Solution();

        int [] nums1= new int[]{1,3};
        int [] nums2= new int[]{2};
        System.out.println(solution.findMedianSortedArrays(nums1,nums2));

        int [] nums3= new int[]{1,2};
        int [] nums4= new int[]{3,4};
        System.out.println(solution.findMedianSortedArrays(nums3,nums4));

        int [] nums5= new int[]{};
        int [] nums6= new int[]{1};
        System.out.println(solution.findMedianSortedArrays(nums5,nums6));

        int [] nums7= new int[]{0,0};
        int [] nums8= new int[]{0,0};
        System.out.println(solution.findMedianSortedArrays(nums7,nums8));



    }
}
