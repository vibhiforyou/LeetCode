package leetcode.problems.easy.LengthofLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        String lastString = null;
        StringBuilder br = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                br.append(s.charAt(i));
            } else {
                if(!br.toString().isBlank()){
                    lastString = br.toString();
                }
                br = new StringBuilder();
            }
        }
        if(!br.toString().isBlank()){
            lastString= br.toString();
        }
        return lastString.length();
    }
}

public class Main {
    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));

    }
}
