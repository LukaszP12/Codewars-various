public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum1 = findSumOfArray(arr, 0, i);
            int sum2 = findSumOfArray(arr, i + 1, arr.length);

            if (sum1 == sum2) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(findEvenIndex(ints));

        int[] ints1 = {1, 100, 50, -51, 1, 1};
        System.out.println(findEvenIndex(ints1));

        int[] ints2 = {20, 10, -80, 10, 10, 15, 35};
        System.out.println(findEvenIndex(ints2));
    }

    private static int findSumOfArray(int[] arr, int begin, int end) {
        int sum = 0;

        for (int i = begin; i < end; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
