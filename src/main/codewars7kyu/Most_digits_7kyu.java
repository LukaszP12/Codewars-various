package codewars7kyu;

class Most_digits_7kyu {
    public static int findLongest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int maxNum = 0;

        for (int num : numbers) {
            int length = String.valueOf(num).length();
            if (length > max) {
                max = length;
                maxNum = num;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int[] ints = {1, 10, 100};
        System.out.println(findLongest(ints));

        int[] ints1 = {9000, 8, 800};
        System.out.println(findLongest(ints1));

        int[] ints2 = {8, 900, 500};
        System.out.println(findLongest(ints2));

        int[] ints3 = {3, 40000, 100};
        System.out.println(findLongest(ints3));

        int[] ints4 = {1, 200, 100000};
        System.out.println(findLongest(ints4));

        int[] ints5 = {10, 1, 0, 1, 10};
        System.out.println(findLongest(ints5));
    }
}
