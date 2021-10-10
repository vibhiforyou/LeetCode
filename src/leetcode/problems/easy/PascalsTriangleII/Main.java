package leetcode.problems.easy.PascalsTriangleII;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new LinkedList<>();
        if (numRows > 0) {
            List<Integer> level1 = new LinkedList<>();
            List<Integer> level2 = new LinkedList<>();
            if (numRows == 1) {
                level1.add(1);
                output.add(level1);
                return output;
            } else if (numRows == 2) {
                level1.add(1);
                level2.add(1);
                level2.add(1);
                output.add(level1);
                output.add(level2);
                return output;
            } else if (numRows > 2) {
                level1.add(1);
                level2.add(1);
                level2.add(1);
                output.add(level1);
                output.add(level2);

                for (int i = 2; i < numRows; i++) {
                    List<Integer> currentLevel = new LinkedList<>();
                    currentLevel.add(1);
                    List<Integer> prevLevel = output.get(i - 1);
                    for (int j = 0; j < prevLevel.size() - 1; j++) {
                        currentLevel.add(prevLevel.get(j) + prevLevel.get(j + 1));
                    }
                    currentLevel.add(1);
                    output.add(currentLevel);
                }
                return output;
            }
        }
        return output;
    }
}


public class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();
        List<List<Integer>> output=solution.generate(5);
        for (List<Integer> elements: output
             ) {
            System.out.print("[");
            for (Integer el :elements) {
                System.out.print(el+",");
            }
            System.out.print("]");
        }
    }
}
