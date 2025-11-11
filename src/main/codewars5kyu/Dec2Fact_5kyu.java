package codewars5kyu;

class Dec2Fact_5kyu {

    public static String dec2FactString(long nb) {
        return "";
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

    public static void main(String[] args) {
        System.out.println(factString2Dec("341010"));
        System.out.println(factString2Dec("1212210"));
    }
}
