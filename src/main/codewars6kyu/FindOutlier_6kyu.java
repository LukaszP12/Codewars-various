package codewars6kyu;

class FindOutlier_6kyu {
    static int find(int[] integers) {
        boolean[] oddIndexes = new boolean[integers.length];

        for (int i = 0; i < integers.length; i++) {
            int num = integers[i];
            if (isOdd(num)) {
                oddIndexes[i] = true;
            } else {
                oddIndexes[i] = false;
            }
        }

        return integers[findOdd(oddIndexes)];
    }

    private static int findOdd(boolean[] oddIndexes) {
        boolean majority = (oddIndexes[0] == oddIndexes[1]) ? oddIndexes[0] : oddIndexes[2];
        for (int i = 0; i < oddIndexes.length; i++) {
            if (oddIndexes[i] != majority) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] ints = {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(ints));
        int[] ints1 = {160, 3, 1719, 19, 11, 13, -21};
        System.out.println(find(ints1));
    }
}
