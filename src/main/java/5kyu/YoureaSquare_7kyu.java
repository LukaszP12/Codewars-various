package org.example;

public class YoureaSquare_7kyu {
    public static boolean isSquare(int n) {
        if (n < 0) return false;

        double doubleNumber = Math.sqrt(n);
        int intPart = (int) doubleNumber;

        double v = doubleNumber - intPart;

        if (v > 0.0){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(7));
        System.out.println(isSquare(25));
        System.out.println(isSquare(16));
        System.out.println(isSquare(5));
    }
}
