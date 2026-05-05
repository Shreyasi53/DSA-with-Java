package AtoZ.Array_mid;

class solution {
    public void rotate(int[][] matrix){
        int n = matrix.length;
        //step-1: Transpose the matrix
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step-2: Reverse element in every row
        for(int i = 0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

public class RotateMatrix {
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
