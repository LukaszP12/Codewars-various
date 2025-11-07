package codewars6kyu;

class EqualSidesOfAnArray_6kyu {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (countSum(0, i, arr) == countSum(i + 1, arr.length, arr)) {
                return i;
            }
        }

        return -1;
    }

    private static int countSum(int i, int j, int[] arr) {
        int sum = 0;

        for (int k = i; k < j; k++) {
            sum += arr[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(findEvenIndex(ints));

        int[] ints1 = {1, 100, 50, -51, 1, 1};
        System.out.println(findEvenIndex(ints1));

        int[] ints2 = {1, 2, 3, 4, 5, 6};
        System.out.println(findEvenIndex(ints2));

        int[] ints3 = {20, 10, 30, 10, 10, 15, 35};
        System.out.println(findEvenIndex(ints3));
    }
}
