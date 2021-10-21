package leetcode.problems.easy.reversestring;

class Solution {
    public void reverseString(char[] s) {
        swap(s, 0, s.length - 1);
    }

    public void swap(char[] s, int leftIndex, int rightIndex) {
        while (leftIndex <= rightIndex) {
            swap(s, leftIndex + 1, rightIndex - 1);

            char temp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temp;
            return;
        }
    }
}

public class Main {
    public static void main(String... args) {
        Solution solution = new Solution();
        solution.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
