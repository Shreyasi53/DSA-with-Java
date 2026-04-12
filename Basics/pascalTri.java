package Basics;//Q. Given Row & Col no tell the element at that place

import java.util.*;

public class pascalTri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number:");
        int row = sc.nextInt();
        System.out.print("Enter the col number");
        int col = sc.nextInt();
        int ans = pascalElement(row, col);

        System.out.println(ans);
    }
    public static int nCr(int n, int r){
        long res = 1;
        for(int i = 1; i <= r; i++){
            res = res * (n-i+1);
            res = res/(i);
        }
        return (int) res;
    }

    public static int pascalElement(int row, int col){
        int n = row-1;
        int r = col-1;
        return nCr(n, r);
    }
}

//time complexity o(r)
