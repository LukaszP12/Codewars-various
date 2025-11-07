package codewars6kyu;

import java.util.ArrayList;
import java.util.List;

class UniqueInOrder_6kyu {

    public static <T> List<T> uniqueInOrder(Iterable<T> iterable) {
        List<T> result = new ArrayList<>();
        T previous = null;

        for (T current : iterable) {
            if (previous == null || !current.equals(previous)) {
                result.add(current);
                previous = current;
            }
        }

        return result;
    }

    public static List<Character> uniqueInOrder(String s) {
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        return uniqueInOrder(chars);
    }

    public static void main(String[] args) {
        System.out.println(uniqueInOrder("AAAABBBCCDAABBB"));
        System.out.println(uniqueInOrder("ABBCcAD"));
        System.out.println(uniqueInOrder(List.of(1, 2, 2, 3, 3)));
    }
}
