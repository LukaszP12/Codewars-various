package org.example;

public class AffordableVacation_5kyu {
    public static String findMinCost(int money, int days, int[] cost) {
        int minCostStay = Integer.MAX_VALUE;

        int i = 0;
        if (cost.length == 1) {
            minCostStay = findConsecutivePrice(i, days, cost);
        }

        for (; i < cost.length - days; i++) {
            int costOfStay = findConsecutivePrice(i, days, cost);
            if (costOfStay < minCostStay) {
                minCostStay = costOfStay;
            }
        }

        if (minCostStay <= money) {
            return "money: " + minCostStay;
        } else {
            // get stay permitted by funds
            int stayDays = longestStayForAmountOfMoneyAndLessDays(money, days, cost);
            if (stayDays == 0) {
                return "Insufficient money at all";
            }
            return "days: " + stayDays;
        }
    }

    private static int longestStayForAmountOfMoneyAndLessDays(int money, int days, int[] cost) {
        int maxDays = 0;
        int stayCost = 0;

        for (int i = 0; i < cost.length; i++) {
            int totalCost = 0;
            for (int j = i; j < i + days - 1; j++) {
                totalCost += cost[j];
                int amountDays = (j - i + 1);
                if (amountDays > maxDays && amountDays <= days - 1) {
                    maxDays = amountDays;
                    stayCost = totalCost;
                }
            }
        }

        if (stayCost <= money) {
            return maxDays;
        }

        return -1;
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
        System.out.println(findMinCost(50, 3, new int[]{10, 40, 5})); // toDo need verification
    }
}
