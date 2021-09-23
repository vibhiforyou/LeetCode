package leetcode.problems.medium.FindAllDuplicatesinanArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public int[] uniqueDuplicatedElements(int input1, int input2[]) {
        Arrays.sort(input2);

        List<Integer> ele = new LinkedList<>();
        int previousElement = input2[0];
        boolean taken = false;
        int n = input2.length;

        for (int i = 1; i < n; i++) {
            if (input2[i] == previousElement && !taken) {
                ele.add(input2[i]);
                taken = true;
            } else {
                previousElement = input2[i];
                taken = false;
            }
        }

        int size = ele.size();
        int[] output = new int[size];

        int i = 0;
        for (Integer e : ele
        ) {
            output[i++] = e;
        }

        return output;
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here

        Solution solution = new Solution();
        int[] response = solution.uniqueDuplicatedElements(9, new int[]{4, 4, 2, 2, 1, 0, 9, 2, 9});
        for (int element : response
        ) {
            System.out.println(element);
        }

    }
}
