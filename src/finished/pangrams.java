import java.io.*;

//A pangram is a string that contains every letter of the alphabet.
//Given a sentence determine whether it is a pangram in the English alphabet.
//Ignore case. Return either pangram or not pangram as appropriate.

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    String isPangram = "pangram";
    s = s.toLowerCase(); // make string lowercase
    for(char alphabet = 'a'; alphabet <='z'; alphabet++ ) { // loop through alphabet
        if (!s.contains(String.valueOf(alphabet))) { // if letter is not present, not pangram
            isPangram = "not pangram";
            break; // break bc no use continuing to loop through
        }
    }
    return isPangram;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}