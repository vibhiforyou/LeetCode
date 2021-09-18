package leetcode.problems.easy.PlusOne;

import java.util.Stack;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        Stack<Integer> integers= new Stack<>();
        boolean carry=true;

        if(isAllNine(digits)){
            int[] newDigit= new int[digits.length+1];
            for(int i=0;i<digits.length;i++){
                newDigit[i+1]=0;
            }
            newDigit[0]=1;
            return newDigit;
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(carry){
                    int newNumber=digits[i];
                    if(newNumber<9){
                        digits[i]=digits[i]+1;
                        carry=false;
                        return digits;
                    }
                    else {
                        digits[i]=0;
                        carry=true;
                    }
                }
            }
        }
        return digits;
    }

    public boolean isAllNine(int[] digits){
        boolean isAllNine=false;
        for (int i =0;i<digits.length;i++){
            if(digits[i]!=9){
                return false;
            }
        }
        return true;
    }
}

public class Main {

    public static void main(String... args) {
        Solution solution = new Solution();
        int[] results = solution.plusOne(new int[]{9, 9,9});
        for (int result : results
        ) {
            System.out.print(result + ":");
        }
    }
}
