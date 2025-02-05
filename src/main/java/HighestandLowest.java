import java.util.TreeSet;

public class HighestandLowest {
    public static String highAndLow(String numbers) {
        String[] split = numbers.split("\\s");

        TreeSet<Integer> nums = new TreeSet<>();

        for (int i = 0; i < split.length; i++) {
            nums.add(Integer.parseInt(split[i]));
        }

        return nums.last() + " " + nums.first();
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }

}
