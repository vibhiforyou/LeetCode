package leetcode.problems.medium.integertoRoman;

public class Solution {
    public String intToRoman(int num) {
        String numberStr = num + "";
        int length = numberStr.length();
        StringBuilder roman=new StringBuilder();
        String romanNumber="";
        for (int i = 0; i < length; i++) {
            int index = length - i;
            int number=giveIndex(Integer.parseInt(Character.toString(numberStr.charAt(i))),index);
            roman.append(romanConverter(number));


        }
        return roman.toString();
    }

    private int giveIndex(int number, int index) {
        for (int i = 0; i < index-1; i++) {
            number=number*10;
        }
        return number;
    }

    private String romanConverter(int num) {
        StringBuilder roman = new StringBuilder();
        if(num >= 1 && num < 10) {
            for (int index = 1 ; index <= num ; index ++) {
                roman.append("I");
                if(index == 4) {
                    roman.setLength(0);
                    roman.append("IV");
                } else if(index == 5) {
                    roman.setLength(0);
                    roman.append("V");
                } else if(index == 9) {
                    roman.setLength(0);
                    roman.append("IX");
                }
            }
        } else if(num >= 10 && num < 100) {
            for (int index = 10; index <= num; index += 10) {
                roman.append("X");
                if (index == 40) {
                    roman.setLength(0);
                    roman.append("XL");
                } else if (index == 50) {
                    roman.setLength(0);
                    roman.append("L");
                } else if (index == 90) {
                    roman.setLength(0);
                    roman.append("XC");
                }
            }
        } else if(num >= 100 && num < 1000) {
            for (int index = 100; index <= num; index += 100) {
                roman.append("C");
                if (index == 400) {
                    roman.setLength(0);
                    roman.append("CD");
                } else if (index == 500) {
                    roman.setLength(0);
                    roman.append("D");
                } else if (index == 900) {
                    roman.setLength(0);
                    roman.append("CM");
                }
            }
        } else if(num >= 1000) {
            for (int index = 1000; index <= num; index += 1000) {
                roman.append("M");
            }
        }
        return roman.toString();
    }
}

class IntegerToRoman {
    public static void main(String args[]) {
        Solution solution= new Solution();
        System.out.println(solution.intToRoman(1994));
    }
}
