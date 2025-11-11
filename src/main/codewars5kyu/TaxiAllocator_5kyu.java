package codewars5kyu;

class TaxiAllocator_5kyu {
    public static int minNumTaxis(int[] requests) {
        return 1;
    }

    public static int minNumTaxis(int[][] requests) {
        int minTaxis = 0;

        int end = 0;
        minTaxis++;

        for (int[] req : requests) {
            if (req[0] + 1 < end) {
                minTaxis++;
            }
            end = req[1];
        }

        return minTaxis;
    }

    public static void main(String[] args) {
        int[] ints = {1, 4};
        System.out.println(minNumTaxis(ints));

        int[][] ints1 = {{1, 4}, {5, 9}};
        System.out.println(minNumTaxis(ints1));

        int[][] ints2 = {{1, 4}, {2, 9}, {3, 6}};
        System.out.println(minNumTaxis(ints2));

        int[][] ints3 = {{1, 4}, {2, 9}, {3, 6}, {5, 8}};
        System.out.println(minNumTaxis(ints3));
    }
}
