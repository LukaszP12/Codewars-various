import java.util.Set;
import java.util.TreeSet;

public class BuddyPairs_5kyu {

    public static String buddy(long start, long limit) {
        String result = "";

        for (long i = start; i < limit; i++) {
            Set<Integer> divisors = getDivisors(i);
            int sum = divisors.stream().mapToInt(Integer::intValue).sum();

            int j = sum - 1;

            if (j > i){
                Set<Integer> divisors1 = getDivisors(j);
                int sum1 = divisors1.stream().mapToInt(Integer::intValue).sum();
                if (sum1 == i + 1){
                    return i + "," + j;
                }
            }
        }
        return result;
    }

    private static Set<Integer> getDivisors(long number) {
        Set<Integer> divisors = new TreeSet<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0 && !divisors.contains(i)) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(buddy(10, 50));
        System.out.println(buddy(48,50));
    }
}
