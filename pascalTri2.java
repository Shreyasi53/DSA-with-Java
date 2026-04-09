//Print any given row
//Let N=5 (input row no) ,, output = 1 4 6 4 1

import java.util.Scanner;

//Nth row always have N element ,, in the 5th row we have 5 elements
//run loop from i=1 to N
//treat i as col and N as row and use(r-1Cn-1)
public class pascalTri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number:");
        int n = sc.nextInt();

        printRow(n);
    }

//    public static void printRow(int n) {
//        for(int i = 1; i<=n; i++){
//            int val = nCr(n-1, i-1);
//            System.out.print(val + " ");
//        }
//    }
//    public static int nCr(int n, int r){
//        long res = 1;
//        for(int i = 1; i <= r; i++) {
//            res = res * (n - i + 1);
//            res = res / (i);
//        }
//        return (int) res;
//    }//the time complexity of this will be O(n*r)

    //better approach with time complexity O(N)
    public static void printRow(int n){
        int res = 1;
        System.out.print(res +" ");

        for(int i=1; i<n; i++){
            res = res * (n-i)/i;
            System.out.print(res + " ");
        }
    }
}
