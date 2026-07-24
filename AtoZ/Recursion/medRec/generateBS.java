package AtoZ.Recursion.medRec;
import java.util.*;
//Problem Statement: Given an integer n, return all binary strings of length n that do not contain consecutive 1s.
//Return the result in lexicographically increasing order.
//A binary string is a string consisting only of characters '0' and '1'.

//Input:
// n = 3
//Output:
// ["000", "001", "010", "100", "101"]
public class generateBS {
    static void generate(int n, String curr, List<String> result){
        //Base case: if length is n, add to result
        if(curr.length() == n){
            result.add(curr);
            return;
        }
        //Always add '0'
        generate(n, curr + "0", result);
        //Add '1' only if previous char is not '1'
        if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
            generate(n, curr + "1", result);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        // Start recursion with empty string
        generate(n, "", result);
        // Print results
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
