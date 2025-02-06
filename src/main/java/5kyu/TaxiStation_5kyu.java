package org.example;

import java.util.Arrays;

public class TaxiStation_5kyu {
    public static int[] calculateTrips(int[] distances, int[] speeds) {
        int numTaxis = speeds.length;

        int[] ridesAssigned = new int[numTaxis];
        boolean[] isOccupied = new boolean[numTaxis];
        int[] returnTime = new int[numTaxis];

        Arrays.fill(isOccupied, false);

        for (int i = 0; i < distances.length; i++) {
            if (allAreOccupied(isOccupied)) {
                int fastestReturnIndex = getFastestReturn(returnTime);
                int timePasted = returnTime[fastestReturnIndex];
                updateTime(timePasted, returnTime, isOccupied);
            }

            int distance = distances[i];
            int numTaxiIndex = findTaxi(isOccupied, speeds);
            isOccupied[numTaxiIndex] = true;
            ridesAssigned[numTaxiIndex]++;
            returnTime[numTaxiIndex] = (distance / speeds[numTaxiIndex] * 2);
        }

        return ridesAssigned;
    }

    private static void updateTime(int timePasted, int[] returnTime, boolean[] isOccupied) {
        for (int i = 0; i < returnTime.length; i++) {
            if (returnTime[i] - timePasted == 0) {
                isOccupied[i] = false;
            }
            returnTime[i] -= timePasted;
        }
    }

    private static int getFastestReturn(int[] returnTime) {
        int index = 0;
        for (int i = 0; i < returnTime.length; i++) {
            if (returnTime[i] < returnTime[index]) {
                index = i;
            }
        }
        return index;
    }

    private static boolean allAreOccupied(boolean[] isOccupied) {
        for (int i = 0; i < isOccupied.length; i++) {
            if (!isOccupied[i]) {
                return false;
            }
        }
        return true;
    }

    private static int findTaxi(boolean[] isOccupied, int[] speeds) {
        int maxSpeed = 0;
        int maxSpeedIndex = 0;

        for (int i = 0; i < speeds.length; i++) {
            if (!isOccupied[i]) {
                if (speeds[i] > maxSpeed) {
                    maxSpeed = speeds[i];
                    maxSpeedIndex = i;
                }
            }
        }
        return maxSpeedIndex;
    }

    public static void main(String[] args) {
        int[] ints = TaxiStation_5kyu.calculateTrips(new int[]{120, 80, 60}, new int[]{50});
        System.out.println(Arrays.toString(ints));

        int[] ints2 = TaxiStation_5kyu.calculateTrips(new int[]{100, 50, 80}, new int[]{50, 80});
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = TaxiStation_5kyu.calculateTrips(new int[]{120}, new int[]{});
        System.out.println(Arrays.toString(ints3));

        int[] ints4 = TaxiStation_5kyu.calculateTrips(new int[] { 100, 50, 80, 40, 40 }, new int[] { 30, 20, 10 });
        System.out.println(Arrays.toString(ints4));
    }
}
