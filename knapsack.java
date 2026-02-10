import java.util.*;

class Item {
    int weight, value;
    double ratio;

    Item(int w, int v) {
        weight = w;
        value = v;
        ratio = (double) v / w;
    }
}
public class FractionalKnapsack {

    public static void main(String[] args) {

        int[] weight = {10, 20, 30};
        int[] value  = {60, 100, 120};
        int capacity = 50;

        int n = weight.length;

        Item[] items = new Item[n];

   
 for (int i = 0; i < n; i++)
 items[i] = new Item(weight[i], value[i]);
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {

            if (capacity >= items[i].weight) {
                
  capacity -= items[i].weight;
   totalValue += items[i].value;
            }
       else {
              
                totalValue += items[i].ratio * capacity;
                break;
            }
        }
 System.out.println("Maximum value = " + totalValue);
    }
}