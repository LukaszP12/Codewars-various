package codewars7kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindTheCapitals_7kyu {
    public static int[] capitals(String s) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(capitals("CodEWaRs")).forEach(System.out::println);
        System.out.println();
        Arrays.stream(capitals("aAbB")).forEach(System.out::println);
        System.out.println();
        Arrays.stream(capitals("AAA")).forEach(System.out::println);
        System.out.println();
    }
}
