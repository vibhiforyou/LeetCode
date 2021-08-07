package leetcode.problems.medium.stringToInteger;

public class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        int strLen = str.length();
        boolean isPositive = true;
        int i = 0;
        int startIndex = 0;
        if(strLen==0)
        {
            return 0;
        }

        if (str.charAt(0) == '-') {
            isPositive = false;
            i++;
            startIndex++;
        }
        if (str.charAt(0) == '+') {
            i++;
            startIndex++;
        }

        for (; i < strLen; i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-'||str.charAt(i) == ' ' || str.charAt(i) == '.' || Character.toString(str.charAt(i)).matches("[a-zA-Z&_\\.-]")) {
                break;
            }
        }
        String number = str.substring(startIndex, i);
        if(number.equals("")||number.equals("+")||number.equals("-"))
        {
            return 0;
        }


        int j = 0;
        while (number.length()>j) {
            if(number.charAt(j)!='0')
                break;
            j++;
        }

        number =number.substring(j,number.length());

        if(number.equals("")||number.equals("+")||number.equals("-"))
        {
            return 0;
        }
        if (number.length() > 10) {
            if (isPositive) {
                return 2147483647;
            } else {
                return -2147483648;
            }
        }
        long longNumber;
        if(isPositive)
        {
            longNumber= Long.parseLong(number);
        }
        else{
            longNumber = Long.parseLong("-"+number);
        }

        if (longNumber < -2147483648)
            return -2147483648;
        if (longNumber > 2147483647)
            return 2147483647;

        return (int)longNumber;
    }
}

class StringToInteger {
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println("words and 987"+":"+solution.myAtoi("words and 987"));
        System.out.println("42"+":"+solution.myAtoi("42"));
        System.out.println("       -42"+":"+solution.myAtoi("    -42"));
        System.out.println("4193 with words"+":"+solution.myAtoi("4193 with words"));
        System.out.println("-91283472332"+":"+solution.myAtoi("-91283472332"));
        System.out.println("-91283472332"+":"+solution.myAtoi("-1-"));

    }
}