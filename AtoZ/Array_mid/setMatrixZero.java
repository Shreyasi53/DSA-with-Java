package AtoZ.Array_mid;

import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        // your full logic here
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;
        //Step-1:check if first row has any zero
        for(int j = 0; j < n; j++ ){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }
        //check if first column has any zero
        for(int i = 0; i<m; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }
        //Mark row and columns
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //Fill remaining matrix
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        //handel first row
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        //handel first col
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

public class setMatrixZero {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        obj.setZeroes(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}