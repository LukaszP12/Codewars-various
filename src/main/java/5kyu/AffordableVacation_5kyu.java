package org.example;

public class AffordableVacation_5kyu {
    public static String findMinCost(int money, int days, int[] cost) {
        int minCostStay = Integer.MAX_VALUE;

        int i = 0;
        for (; i < cost.length; i++) {
            int costOfStay = findConsecutivePrice(i, days, cost);
            if (costOfStay < minCostStay) {
                minCostStay = costOfStay;
            }
        }

        if (minCostStay <= money) {
            return "money: " + minCostStay;
        } else {
            // get stay permitted by funds
            int stayDays = longestStayForAmountOfMoney(money, cost);
        }

        return "no money";
    }

    private static int findConsecutivePrice(int i, int days, int[] cost) {
        int totalCost = 0;
        for (int j = i; j < i + days; j++) {
            totalCost += cost[j];
        }

        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println(findMinCost(10, 1, new int[]{5}));
        System.out.println(findMinCost(10, 1, new int[]{3, 2, 4}));
        System.out.println(findMinCost(10, 1, new int[]{20, 15, 30}));
        System.out.println(findMinCost(10, 2, new int[]{9, 6, 7, 4}));
    }
}
