import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayCombinations_6kyu {
    public static int solve(final List<List<Integer>> data) {
        Set<String> results = new HashSet<>();

        for (int i = 0; i < data.size(); i++) {
            Set<Integer> combinations = new HashSet<>();
            getResult(combinations, i, results, data);
        }

        System.out.println("results: " + results);
        return results.size();
    }

    private static void getResult(Set<Integer> combinations, int level, Set<String> results, List<List<Integer>> data) {

        if (level == data.size()) {

            if (combinations.size() == data.size()) {
                results.add(combinations.toString());
            }
            return;
        }

        List<Integer> integers = data.get(level);

        for (int i = 0; i < integers.size(); i++) {
            combinations.add(integers.get(i));
            getResult(combinations, level + 1, results, data);
            combinations.remove(integers.get(i));
        }

    }

    public static void main(String[] args) {
//        List<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(4);
//
//        List<Integer> list3 = new LinkedList<>();
//        list3.add(5);
//        list3.add(6);
//
//        List<List<Integer>> mainList = new LinkedList<>();
//        mainList.add(list1);
//        mainList.add(list2);
//        mainList.add(list3);
//
//        System.out.println(solve(mainList));

//        List<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(4);
//        list2.add(4);
//
//        List<Integer> list3 = new LinkedList<>();
//        list3.add(5);
//        list3.add(6);
//        list3.add(6);
//
//        List<List<Integer>> mainList = new LinkedList<>();
//        mainList.add(list1);
//        mainList.add(list2);
//        mainList.add(list3);
//
//        System.out.println(solve(mainList));


//        List<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(3);
//        list2.add(4);
//
//        List<Integer> list3 = new LinkedList<>();
//        list3.add(5);
//        list3.add(6);
//
//        List<List<Integer>> mainList = new LinkedList<>();
//        mainList.add(list1);
//        mainList.add(list2);
//        mainList.add(list3);
//
//        System.out.println(solve(mainList));

        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(6);
        list2.add(6);
        list2.add(7);

        List<Integer> list3 = new LinkedList<>();
        list3.add(8);
        list3.add(9);
        list3.add(10);
        list3.add(12);
        list3.add(5);
        list3.add(6);

        List<List<Integer>> mainList = new LinkedList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(solve(mainList));

        // TODO: 30.05.2024
        // wrong result
        // expected:<72> but was:<46>
    }
}
