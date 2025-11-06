package codewars4kyu;

class RangeExtraction_4kyu {
    public static String rangeExtraction(int[] arr) {
        int prev = arr[0];

        String result = "";
        int cRange = 0;

        int i = 1;

        for (; i < arr.length; i++) {
            int current = arr[i];
            if (prev + 1 == current) {
                prev = current;
                cRange++;
                continue;
            }

            if (cRange >= 3) {
                result += arr[i - 1 - cRange] + "-" + prev + ",";
                prev = current;
                cRange = 0;
                continue;
            }

            result += prev + ",";
            prev = current;
        }

        if (cRange > 0) {
            result += arr[i - 1 - cRange] + "-" + prev;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(rangeExtraction(ints));

        int[] ints1 = {-3, -2, -1, 2, 10, 15, 16, 18, 19, 20};
        System.out.println(rangeExtraction(ints1));

        int[] ints2 = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(rangeExtraction(ints2));
    }
}
