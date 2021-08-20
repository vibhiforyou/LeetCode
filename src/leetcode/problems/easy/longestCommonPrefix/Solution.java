package leetcode.problems.easy.longestCommonPrefix;

import java.lang.reflect.GenericDeclaration;
import java.util.*;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        //check for minimum length
        int min = strs[0].length();
        int startIndex = 0;
        int endIndex = 0;
        for (String str : strs) {
            if (min > str.length()) {
                min = str.length();
            }
        }

        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return strs[0].substring(startIndex, endIndex);
                }

            }
            endIndex++;
        }
        return strs[0].substring(startIndex, endIndex);
    }

}

class CommonPrfixSolution {
    public static void main(String... args) {
        Solution solution = new Solution();
        String str = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(str);


        String str1 = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        System.out.println(str1);

        String str2 = solution.longestCommonPrefix(new String[]{"a"});
        System.out.println(str2);

        String str3 = solution.longestCommonPrefix(new String[]{""});
        System.out.println(str3);
    }

}