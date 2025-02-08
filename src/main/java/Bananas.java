import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bananas {

    static HashMap<String, Integer> bananas = new HashMap<>();

    static Set<String> bananaCombinations = new HashSet<>();

    static Set<String> bananas(final String s) {
        Set<String> bananas = new HashSet<>();

        if (containsBananaSet(s)) {

        }

        if (isStillBanana(s)) {
//            bananaCombinations = new HashSet<>();
            bananaCombinations.add(s);
//            return bananaCombinations;
        }

        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(0, i) + '-' + s.substring(i + 1);
            if (moreBanana(s, s1)) {
                bananas(s1);
            }
        }

        // Your code here!
        return bananaCombinations;
    }

    private static boolean moreBanana(String s, String s1) {
        if (bananas == null) {
            bananas.put("a", 3);
            bananas.put("b", 1);
            bananas.put("n", 2);
            bananas.put("s", 1);
        }

        HashMap<String, Integer> first = convertToBananasMap(s);
        HashMap<String, Integer> second = convertToBananasMap(s1);

        if ((first.getOrDefault("a", 0) != 0 && second.getOrDefault("a", 0) != 0) && (first.getOrDefault("a", 0) - second.getOrDefault("a", 0) > 0)) {
            return true;
        } else if ((first.getOrDefault("b", 0) != 0) && (first.getOrDefault("b", 0) - second.getOrDefault("b", 0) > 0)) {
            return true;
        } else if ((first.getOrDefault("n", 0) != 0 && second.getOrDefault("n", 0) != 0) && (first.getOrDefault("n", 0) - second.getOrDefault("n", 0) > 0)) {
            return true;
        } else if ((first.getOrDefault("s", 0) != 0) && (first.getOrDefault("s", 0) - second.getOrDefault("s", 0) > 0)) {
            return true;
        }

        return false;
    }

    private static HashMap<String, Integer> convertToBananasMap(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'b' || c == 'n' || c == 's') {
                String key = "" + c;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        return map;
    }

    private static boolean isStillBanana(String s) {
        String newS = s.replaceAll("-", "");
        return newS.equals("banana");
    }

    public static void main(String[] args) {
        Set<String> bananas1 = bananas("bbananana");
        System.out.println(bananas1);
//        Set<String> bananas2 = bananas("-banana--");

//        boolean stillBanana = isStillBanana("b-anana--");
//        System.out.println(stillBanana);
//
//        boolean notBanana = isStillBanana("notBanana");
//        bananas("notBanana");
//        System.out.println(notBanana);
//
//        boolean notBanana2 = isStillBanana("this is a cucumber");
//        System.out.println(notBanana2);
    }
}
