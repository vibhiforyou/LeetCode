package leetcode.problems.medium.ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        int column = s.length();
        char str[][] = new char[numRows][column];
        int strindex = 0;
        for (int j = 0; j < column && strindex<column; j++) {
            for (int i = 0; i < numRows && strindex<column; i++) {

                    str[i][j] = s.charAt(strindex);
                    strindex++;
            }

        }



        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
        return null;
    }
}

class MainClass {
    public static void main(String args[]) {
        String str = "PAYPALISHIRING";
        Solution solution = new Solution();
        System.out.println(solution.convert(str, 3));

    }
}
