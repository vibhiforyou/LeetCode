package leetcode.problems.medium.longestSubstringWithoutRepeatingChar;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int maxlength=0;
    int charCount=0;
    public int lengthOfLongestSubstring(String s) {


        for(int i=0;i<s.length();i++){
            charCount=0;
            List<Character> temp= new ArrayList<>();

            for (int j=i;j<s.length();j++)
            {
                    if(!temp.contains(s.charAt(j))){
                        temp.add(s.charAt(j));
                        charCount++;
                        maxlength =Math.max(charCount,maxlength);
                    }
                    else
                    {
                        break;
                    }

            }
        }
        return Math.max(charCount,maxlength);
    }

}

class longestSubstring {
    public static void main(String args[]) {
        String s = " ";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
