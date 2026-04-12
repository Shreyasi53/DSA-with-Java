package Basics;

import java.util.Scanner;

//Given N , print the whole pascal triangle
//LC 118
//input N=3
//output = [[1],[1,1],[1,2,1]]
public class pascalTri3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        printPascal(n);
    }
    public static void printPascal(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                int val = nCr(row-1, col-1);
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static int nCr(int n, int r){
        long res=1;
        for(int i=1; i<=r; i++){
            res = res*(n-i+1);
            res = res/i;
        }
        return(int) res;
    }
}
/*import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList<>();

            int res = 1;
            row.add(res);

            for(int j = 1; j < i; j++){
                res = res * (i - j) / j;
                row.add(res);
            }

            ans.add(row);
        }

        return ans;
    }
}*/