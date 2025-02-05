public class Square_n_Sum {

    public static int squareSum(int[] n) {
        int sumOfSquares = 0;

        for (int i = 0; i < n.length; i++) {
            sumOfSquares += Math.pow(n[i], 2);
        }

        return sumOfSquares;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 2};
        System.out.println(squareSum(ints));
    }

}
