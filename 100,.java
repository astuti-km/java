import java.util.*;

class Item {
    int value, weight;
    double ratio;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        Item[] items = new Item[values.length];

        for (int i = 0; i < values.length; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // sort by ratio (descending)
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += item.value * ((double) capacity / item.weight);
                break;
            }
        }

        System.out.println("Maximum value = " + totalValue);
    }
}


public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        int n = values.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        values[i - 1] + dp[i - 1][w - weights[i - 1]],
                        dp[i - 1][w]
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("Maximum value = " + dp[n][capacity]);
    }
}


import java.util.*;

public class CashierGreedy {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;

        int count = 0;

        System.out.println("Coins used:");

        // start from largest coin
        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount >= coins[i]) {
                int num = amount / coins[i];   // how many coins
                count += num;
                amount -= num * coins[i];

                // print coins
                for (int j = 0; j < num; j++) {
                    System.out.print(coins[i] + " ");
                }
            }
        }

        System.out.println("\nTotal coins = " + count);
    }
}
