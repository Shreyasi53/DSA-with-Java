package AtoZ.Array_mid;

//Lc: 121 Best time to buy ans sell stock
import java.util.*;
public class stockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days:");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int buy = prices[0];
        int profit = 0;

        for(int i = 0; i<n; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if(prices[i]-buy>profit){
                profit = prices[i]- buy;
            }
        }
        System.out.println("total profit "+profit);
    }
}
