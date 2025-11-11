package codewars5kyu;

class Dec2Fact_5kyu {

    public static String dec2FactString(long nb) {
        if (nb == 0) {
            return "0";
        }

        String output = "";

        int k = 1;
        while (getFactorial(k) <= nb) {
            k++;
        }
        k--;

        for (int i = k; i >= 1; i--) {
            long factorial = getFactorial(i);
            long coef = nb / factorial;
            nb = nb % factorial;
            output += toChar(coef);
        }

        return output + "0";
    }

    public static long factString2Dec(String str) {
        long sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(str.length() - 1 - i) - '0') * getFactorial(i);
        }

        return sum;
    }

    private static long getFactorial(int i) {
        if (i == 0) return 0;

        int num = 1;

        for (int k = 1; k <= i; k++) {
            num *= k;
        }

        return num;
    }

    private static char toChar(long value) {
        if (value < 10) return (char) ('0' + value);
        else return (char) ('A' + (value - 10));
    }

    public static void main(String[] args) {
        System.out.println(factString2Dec("341010"));
        System.out.println(factString2Dec("1212210"));

        System.out.println(dec2FactString(463));
    }
}
