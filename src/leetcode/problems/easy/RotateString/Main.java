package leetcode.problems.easy.RotateString;
class Solution
{
    public boolean rotateString(String s, String goal) {
        int sLength=s.length();
        int goalLength=goal.length();
        if(sLength!=goalLength){
            return false;
        }
        int roateCount=0;
        while(!s.equals(goal) && roateCount<sLength){
            s=rotateString(s);
            roateCount++;
        }
        if(s.equals(goal)){
            return true;
        }
        return false;

    }
    private String rotateString(String str){
        StringBuilder br= new StringBuilder();
        for(int i=1;i<str.length();i++){
            br.append(str.charAt(i));
        }
        br.append(str.charAt(0));
        return br.toString();
    }
}
public class Main {
    public static void main(String args[]){
        Solution solution= new Solution();
        System.out.println(solution.rotateString("abcde","cdeab"));
        System.out.println(solution.rotateString("abcde","abced"));
    }
}
