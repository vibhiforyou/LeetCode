package leetcode.problems.easy.FirstBadVersion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import java.util.HashMap;
import java.util.Map;

class Solution {
    int badNumberPosition;
    public int firstBadVersion(int n) {
        int l = 1, h = n, mid = 0;
        int latestBad = 1;
        while (l <= h) {
            mid = l + ((h - l) / 2);
            System.out.println(mid);
            boolean result = isBadVersion(mid);
            if (result) {
                latestBad = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return latestBad;
    }

    private boolean isBadVersion(int number) {
        if (badNumberPosition == number) {
            return true;
        }
        return false;
    }
}

public class Main {

    public static void main(String... args) {
        int input = 2126753390;

        int badVersionPosition = 1702766719;

        Solution solution = new Solution();
        solution.badNumberPosition = badVersionPosition;
        System.out.println(solution.firstBadVersion(input));
    }
}
