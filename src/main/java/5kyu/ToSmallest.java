package org.example;

public class ToSmallest {

    public static long[] smallest(long n) {

        String number = String.valueOf(n);
        long[] results = new long[3];

        int minNumber = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < number.length(); i++) {
            String sNumber = number.substring(0, i) + number.substring(i + 1, number.length());
            for (int j = 0; j < sNumber.length(); j++) {
                String newNumber = sNumber.substring(0, j) + number.charAt(i) + sNumber.substring(j, sNumber.length());
                int nNum = Integer.parseInt(newNumber);
                if (nNum < minNumber) {
                    minNumber = nNum;
                    minIndex = i;
                    results[0] = minNumber;
                    results[1] = minIndex;
                    results[2] = j;
                }
            }
        }

        System.out.println("minNumber: " + minNumber + " minIndex: " + minIndex);
        // your code
        return results;
    }

    public static void main(String[] args) {
        smallest(261235);
        long[] smallest = smallest(261235);
        System.out.println(smallest[0] + ": " + smallest[1] + ": " + smallest[2] + ": ");

        long[] smallest1 = smallest(209917);
        System.out.println(smallest1[0] + ": " + smallest1[1] + ": " + smallest1[2] + ": ");

        smallest(1000000);
        smallest(285365);
        smallest(269045);
        smallest(296837);
//        smallest(922193706212817280);
    }
}
