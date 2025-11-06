package codewars6kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class WhichAreIn_6kyu {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> set1 = convertToSet(array1);
        Set<String> set2 = convertToSet(array2);

        List<String> result = new ArrayList<>();

        for (String s1 : set1) {
            for (String s2 : set2) {
                if (s2.contains(s1)) {
                    result.add(s1);
                    break;
                }
            }
        }

        return result.stream().sorted().toArray(String[]::new);
    }

    public static String[] inArray_2(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(s1 -> Arrays.stream(array2).anyMatch(s2 -> s2.contains(s1)))
                .sorted()
                .distinct()
                .toArray(String[]::new);
    }

    private static Set<String> convertToSet(String[] array1) {
        return Arrays.stream(array1).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        String[] a = {"arp", "live", "strong"};
        String[] b = {"lively", "alive", "harp", "sharp", "armstrong"};
        Arrays.stream(inArray(a, b)).forEach(System.out::println);

        String[] a1 = {"arp", "live", "strong"};
        String[] b1 = {"lively", "alive", "harp", "sharp", "armstrong"};
        Arrays.stream(inArray_2(a1, b1)).forEach(System.out::println);
    }
}
