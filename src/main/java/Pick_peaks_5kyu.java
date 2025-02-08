import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pick_peaks_5kyu {

    public static Map<Integer, List<String>> getPeaks(int[][] arr) {

        Map<Integer, List<String>> map = new HashMap<>();
//        HashSet<Integer> peaks = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j] > arr[i][j - 1]) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        List<String> positions = map.get(arr[i][j]);
                        if (positions == null) {
                            positions = new ArrayList<>();
                        }
                        positions.add(i + "," + j);
                        map.put(arr[i][j], positions);
                    }
                }

                if (arr[i][j] > arr[i][j - 1]) {
                    if (arr[i][j] >= arr[i][j + 1]) {
                        if (arr[i][j + 1] >= arr[i][j + 2]) {
                            List<String> positions = map.get(arr[i][j]);
                            if (positions == null) {
                                positions = new ArrayList<>();
                            }
                            positions.add(i + "," + (j - 1));
                            map.put(arr[i][j], positions);
                        }
                    }
                }

            }
        }

        return map;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 6, 4, 1, 2, 3, 2, 1},
                {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3},
                {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1},
                {2, 1, 3, 1, 2, 2, 2, 2, 1},
                {2, 1, 3, 1, 2, 2, 2, 2}};

        System.out.println(getPeaks(array));
    }
}
