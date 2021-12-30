package leetcode.problems.medium.UniquePathsII;

public class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;

        int arr[][]= new int[row][col];
        //first row processing
        boolean obstFlag=false;
        for(int i=0;i<col;i++){
            if(obstFlag || obstacleGrid[0][i]==1){
                arr[0][i]=0;
                obstFlag=true;
            }
            else
            {
                arr[0][i]=1;
            }
        }


        //first Column processing
        obstFlag=false;
        for(int i=0;i<row;i++){
            if(obstFlag || obstacleGrid[i][0]==1){
                arr[i][0]=0;
                obstFlag=true;
            }
            else
            {
                arr[i][0]=1;
            }
        }


        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(obstacleGrid[i][j]==1){
                    arr[i][j]=0;
                }
                else
                {
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[row-1][col-1];
    }
    public static void main(String args[]){
        System.out.println(Solution.uniquePathsWithObstacles(new int[][]{{0,0}}));
    }
}
