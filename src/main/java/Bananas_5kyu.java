import java.util.HashSet;
import java.util.Set;

public class Bananas_5kyu {

    static final String banana = "banana";

    public static Set<String> getBananas(String input) {
        Set<String> results = new HashSet<>();
        search(input, 0, 0, "", results);
        return results;
    }

    private static void search(String input,
                               int posInput,
                               int posBanana,
                               String current,
                               Set<String> results) {
        if (posBanana == banana.length()) {
            results.add(current + "-".repeat(input.length() - posInput));
            return;
        }

        if (posInput == input.length()) {
            return;
        }

        char c = input.charAt(posInput);

        if (c == banana.charAt(posBanana)) {
            search(input, posInput + 1, posBanana + 1, current + c, results);
        }

        search(input, posInput + 1, posBanana, current + "-", results);
    }

    public static void main(String[] args) {
        getBananas("bbananana")
                .stream()
                .forEach(System.out::println);

    }
}
