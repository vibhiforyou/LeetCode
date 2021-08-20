package leetcode.problems.easy.exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'difference_calculator' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int difference_calculator(List<Integer> arr) {
        // Write your code here
        int k=arr.get(0);
        int count=0;
        int indicator1Count=0;
        int indicator2Count=0;
        int startIndex=1;
        List<Element> listOfElements= new ArrayList<>();
        for (int i=0;i<arr.size();i++)
        {

              if(k==arr.get(i) )
              {
                  count++;
              }
              else
              {
                  Element element= new Element(k,count,startIndex);
                  listOfElements.add(element);
                  k= arr.get(i+1);
                  startIndex=i+1;
                  count=1;
              }
        }
        Element element= new Element(k,count,startIndex);
        listOfElements.add(element);


        for (Element ele :listOfElements) {
            if(ele.getNumber()==ele.getCount())
            {
                indicator1Count++;
            }
        }

        for (Element ele :listOfElements) {
            if(ele.getStartIndex()==ele.getCount())
            {
                indicator2Count++;
            }
        }

        if(indicator1Count<indicator2Count)
            return indicator2Count-indicator1Count;
        else
            return indicator1Count-indicator2Count;

    }

}

class Element
{
    private int number;
    private int count;
    private int startIndex;

    Element(int number,int count,int startIndex){
        this.number=number;
        this.count=count;
        this.startIndex=startIndex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.difference_calculator(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
