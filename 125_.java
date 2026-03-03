import java.util.*;

public class Knapsack01 {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] profit = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit and weight: ");
            profit[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        System.out.print("Enter capacity of knapsack: ");
        int capacity = sc.nextInt();

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {

                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }

                else if (weight[i - 1] <= w) {
                    dp[i][w] = max(
                            profit[i - 1] + dp[i - 1][w - weight[i - 1]],
                            dp[i - 1][w]
                    );
                }

                else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("Maximum Profit = " + dp[n][capacity]);
    }
}
output
Enter number of items: 4
Enter profit and weight: 10 5
Enter profit and weight: 40 4
Enter profit and weight: 30 6
Enter profit and weight: 50 3
Enter capacity of knapsack: 10
Maximum Profit = 90


import java.util.*;

class Item {
    int weight;
    int profit;
    double ratio;

    Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = (double) profit / weight;
    }
}

public class FractionalKnapsack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit and weight: ");
            int profit = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(profit, weight);
        }

        System.out.print("Enter capacity of knapsack: ");
        int capacity = sc.nextInt();

        // Sort items by profit/weight ratio (descending)
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0.0;

        for (int i = 0; i < n; i++) {

            if (capacity >= items[i].weight) {
                totalProfit += items[i].profit;
                capacity -= items[i].weight;
            } 
            else {
                totalProfit += items[i].ratio * capacity;
                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}
output
Enter number of items: 4
Enter profit and weight: 10 5
Enter profit and weight: 40 4
Enter profit and weight: 30 6
Enter profit and weight: 50 3
Enter capacity of knapsack: 10
Maximum Profit = 105.0

