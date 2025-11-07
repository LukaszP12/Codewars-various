package codewars5kyu;

class MeanSquareError_5kyu {
    public static double solution(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return 0;
        }

        double result = 0;

        for (int i = 0; i < arr1.length; i++) {
            double powed = Math.pow(Math.abs(arr1[i] - arr2[i]), 2.0);
            result += powed;
        }

        return (result / arr1.length);
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        int[] ints1 = {4, 5, 6};
        System.out.println(solution(ints,ints1));

        int[] ints2 = {10, 20, 10, 2};
        int[] ints3 = {10, 25, 5, -2};
        System.out.println(solution(ints2,ints3));

        int[] ints4 = {-1, 0};
        int[] ints5 = {0, -1};
        System.out.println(solution(ints4,ints5));
    }
}
