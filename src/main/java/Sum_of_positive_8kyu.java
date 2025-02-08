public class Sum_of_positive_8kyu {

    public static int sum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {1, -4, 7, 12};
        System.out.println(sum(ints));
    }
}
