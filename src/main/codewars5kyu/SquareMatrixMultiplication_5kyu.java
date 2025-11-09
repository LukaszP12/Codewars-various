package codewars5kyu;

import java.util.Arrays;

class SquareMatrixMultiplication_5kyu {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {  // rows of a
            for (int j = 0; j < n; j++) { // column of b
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2},
                {3, 2}};

        int[][] b = {{3, 2},
                {1, 1}};

        System.out.println(Arrays.deepToString(matrixMultiplication(a,b)));
    }
}
