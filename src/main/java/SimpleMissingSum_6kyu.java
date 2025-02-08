import java.util.Arrays;

public class SimpleMissingSum_6kyu {

    static boolean doesAddUp = false;

    public static int solve(int[] arr) {
        int max_sum = Arrays.stream(arr).sum();

        for (int i = 1; i <= max_sum; i++) {
            boolean[] visited = new boolean[arr.length];
            addUp(i, arr, visited);
            if (!doesAddUp) {
                return i;
            }
        }

        return -1;
    }

    private static void addUp(int i, int[] arr, boolean[] visited) {

        if (i == 0) {
            doesAddUp = true;
            return;
        }

        if (i < 0) {
            return;
        }

        if (allVisited(visited)) {
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (visited[j] == false) {
                int number = arr[j];
                visited[j] = true;
                addUp(i - number, arr, visited);
            }
        }

    }

    private static boolean allVisited(boolean[] visited) {
        for (boolean v : visited) {
            if (v == false) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 8, 7};

//        int[] ints2 = {1, 2};
        System.out.println(solve(ints));

//        boolean[] visited = new boolean[ints2.length];
//        for (int k = 0; k < visited.length; k++) {
//            visited[k] = false;
//        }
//
//        addUp(3, ints2, visited);
//        System.out.println(doesAddUp);

        int[] ints1 = {2, 12, 3, 1};

    }
}
