import java.io.*;
import java.util.*;

// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.

class Result {
    /*
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    Collections.sort(arr);
    long maxValue = 0;
    long minValue = 0;
    
    for (int i = 0; i < 4; i ++) { // iterate through list
    minValue += arr.get(i); // get values of list 0-3 (lowest 4)
    maxValue += arr.get(i + 1); // get values of list 1-4 (top 4)
    }
    System.out.println(minValue + " " + maxValue); // print result
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}