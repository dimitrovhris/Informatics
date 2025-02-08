package maturaAvgust24;

import java.util.Scanner;

public class Zad26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split("\\s+");

        int[] profits = new int[n];

        for(int i = 0; i < n; i++){
            profits[i] = Integer.parseInt(input[i]);
        }

        int profitMonths = 1;
        int longestPeriod = 1;
        for(int i = 1; i < n; i++){
            if(profits[i] >= profits[i-1]){
                profitMonths++;
                if(profitMonths > longestPeriod){
                    longestPeriod = profitMonths;
                }
            } else{
                profitMonths = 1;
            }
        }

        int minimumProfit = Integer.MAX_VALUE;
        int minimumProfitIndex = 0;
        for(int i = 0; i < n; i++){
            if(profits[i] < minimumProfit){
                minimumProfit = profits[i];
                minimumProfitIndex = i;
            }
        }
        int profitToCompare;
        if(minimumProfitIndex == profits.length - 1){
            profitToCompare = profits[minimumProfitIndex - 1];
        } else{
            profitToCompare = profits[minimumProfitIndex + 1];
        }

        double percent = (profitToCompare - minimumProfit) / (1.0 * profitToCompare / 100);
        System.out.printf("Longest period with bigger profit is %d months.%n", longestPeriod);
        System.out.printf("Smaller with %.2f%%", percent);
    }
}
