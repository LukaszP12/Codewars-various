import java.util.Arrays;

class TribonacciSequence_6kyu {

    public static double[] tribonacci(double[] s, int n) {
        if (n <= 0) return new double[0];

        double[] res = new double[n];
        int copy = Math.min(3, n);
        System.arraycopy(s, 0, res, 0, copy);

        for (int i = 3; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
        }

        return res;
    }


    public static void main(String[] args) {
        double[] doubles = {1, 1, 1};
        double[] tribonacci = tribonacci(doubles, 10);

        Arrays.stream(tribonacci).forEach(System.out::println);
    }
}
