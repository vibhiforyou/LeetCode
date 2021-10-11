package leetcode.problems.easy.AddBinary;

import java.io.BufferedReader;

class Solution {
    public String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        boolean isCarry = false;
        StringBuilder sb = new StringBuilder();
        while (aLength >= 0 && bLength >= 0) {
            if (a.charAt(aLength) == '0' && b.charAt(bLength) == '0' && isCarry == false) {
                sb.append('0');
            } else if (a.charAt(aLength) == '0' && b.charAt(bLength) == '0' && isCarry == true) {
                sb.append('1');
                isCarry = false;

            } else if ((a.charAt(aLength) == '1' && b.charAt(bLength) == '1' && isCarry == false) ||
                    (a.charAt(aLength) == '1' && b.charAt(bLength) == '0' && isCarry == true) ||
                    (a.charAt(aLength) == '0' && b.charAt(bLength) == '1' && isCarry == true)) {
                sb.append('0');
                isCarry = true;
            } else if ((a.charAt(aLength) == '1' && b.charAt(bLength) == '0' && isCarry == false) ||
                    (a.charAt(aLength) == '0' && b.charAt(bLength) == '1' && isCarry == false)) {
                sb.append('1');
            } else if (a.charAt(aLength) == '1' && b.charAt(bLength) == '1' && isCarry == true) {
                sb.append('1');

            }
            aLength--;
            bLength--;
        }
        while (aLength >= 0) {
            if (a.charAt(aLength) == '1' && isCarry == true) {
                sb.append(0);
                isCarry = true;
            } else if (a.charAt(aLength) == '0' && isCarry == true) {
                sb.append(1);
                isCarry = false;
            } else if (a.charAt(aLength) == '0' && isCarry == false) {
                sb.append(0);
            }else if(a.charAt(aLength) == '1' && isCarry == false){
                sb.append(1);
            }

            aLength--;
        }
        while (bLength >= 0) {
            if (b.charAt(bLength) == '1' && isCarry == true) {
                sb.append(0);
                isCarry = true;
            } else if (b.charAt(bLength) == '0' && isCarry == true) {
                sb.append(1);
                isCarry = false;
            } else if (b.charAt(bLength) == '0' && isCarry == false) {
                sb.append(0);
            }else if(b.charAt(bLength) == '1' && isCarry == false){
                sb.append(1);
            }
            bLength--;
        }
        if(isCarry==true)
        {
            sb.append(1);
        }
        return sb.reverse().toString();

    }
}

public class Main {
    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "11"));
        System.out.println(solution.addBinary("1010", "1011"));
        System.out.println(solution.addBinary("10", "11"));
        System.out.println(solution.addBinary("1", "111"));
        System.out.println(solution.addBinary("100", "110010"));

    }
}
