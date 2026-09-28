//TC: O(n log n) due to sorting
//SC: O(n) for storing items.
//1. Calculate value/weight ratio for every item.
//2. Sort items by ratio in descending order.
//3. Take the item with highest ratio first.
//4. If it doesn't completely fit → take the required fraction.
//5. Stop when the bag is full.

package AtoZ.Greedy;
import java.util.*;
public class FractionalKnapsack {
    static class Item{
        int value, weight;
        Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }

    public double fractionalKS(int[] value, int[] weight, int W){
        int n = value.length;
        Item[] items = new Item[n];
        for(int i = 0; i < n; i++){
            items[i] = new Item(value[i], weight[i]);
        }
        // Sort by value/weight ratio in descending order
        Arrays.sort(items, (a, b) ->
                Double.compare(
                        (double)b.value / b.weight,
                        (double)a.value / a.weight
                )
        );
        double totalValue = 0;
        for (Item item : items) {

            if (W >= item.weight) {
                // Take entire item
                totalValue += item.value;
                W -= item.weight;
            }
            else {
                // Take fraction of item
                totalValue += ((double)item.value / item.weight) * W;
                break;
            }
        }

        return totalValue;
    }
}
