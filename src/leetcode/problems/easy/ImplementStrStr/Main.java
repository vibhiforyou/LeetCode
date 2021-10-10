package leetcode.problems.easy.ImplementStrStr;

class Solution{
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if((needleLength==0 && haystackLength==0) || (needleLength==0 && haystackLength!=0)){
            return 0;
        }

        if (needleLength > haystackLength )
        {
            return -1;
        }

        for(int i=0;i<haystackLength;i++){
            int j=0;
            boolean isMatch=false;
            if(haystack.charAt(i)==needle.charAt(j)){
                if(i+needleLength<=haystackLength){
                    isMatch=true;
                    for(int k=i;k<i+needleLength;k++,j++){
                        if(haystack.charAt(k)!=needle.charAt(j)){
                            isMatch=false;
                            break;
                        }
                    }
                }
                else
                {
                    return -1;
                }
            }
            if(isMatch)
                return i;
        }
        return -1;
    }
}

public class Main {

    public static void main(String... args){
        Solution solution= new Solution();
        System.out.println(solution.strStr("hello","ll"));
        System.out.println(solution.strStr("aaaaa","bba"));
        System.out.println(solution.strStr("",""));
        System.out.println(solution.strStr("mississippi","issipi"));
        System.out.println(solution.strStr("a","a"));
    }
}
