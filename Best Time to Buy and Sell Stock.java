import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            max = Math.max(max, price - min); // Update max profit
            min = Math.min(min, price);       // Track lowest price seen so far
        }return max;
    }
}
public class BuyStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.trim().split("\\s+");
        int[] prices = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            prices[i] = Integer.parseInt(tokens[i]);
        }
        Solution sol = new Solution();
        System.out.println(sol.maxProfit(prices));
    }
}
