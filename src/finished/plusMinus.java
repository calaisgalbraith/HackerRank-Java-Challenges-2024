import java.io.*;
import java.util.*;
// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
// Print the decimal value of each fraction on a new line with  places after the decimal.

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float posRatio = 0;
    float negRatio = 0;
    float zeroRatio = 0;
    int total = arr.size();

    for(int variable : arr) { // iterate through list
        if (variable > 0) { // if pos numb, add to posRatio
            posRatio++;
        } else if (variable < 0) { // if neg numb, add to negRatio
            negRatio++;
        } else { // if zero, add to zeroRatio
            zeroRatio++;
        }
    }
   
    // print out ratios
    System.out.println(posRatio / total); 
    System.out.println(negRatio / total);
    System.out.println(zeroRatio / total);
    }

}

public class plusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}