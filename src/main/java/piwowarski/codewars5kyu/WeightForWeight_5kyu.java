package piwowarski.codewars5kyu;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WeightForWeight_5kyu {

    public static String orderWeight(String strng) {
        String[] splitNumbers = strng.split("\\s");

        Map<Integer, List<String>> treeMap = new TreeMap<>();

        for (String number : splitNumbers) {
            int numberFromString = stringToNumber(number);
            if (treeMap.containsKey(numberFromString)) {
                List<String> strings = treeMap.get(numberFromString);
                strings.add(number);
                treeMap.put(numberFromString, strings);
            } else {
                LinkedList<String> strings = new LinkedList<>();
                strings.add(number);
                treeMap.put(numberFromString, strings);
            }
        }

        String result = "";

        for (Map.Entry<Integer, List<String>> entries : treeMap.entrySet()) {
            List<String> values = entries.getValue();
            Collections.sort(values);

            for (int i = 0; i < values.size(); i++) {
                result += "" + values.get(i) + " ";
            }
        }

        return result.trim();
    }

    private static int stringToNumber(String number) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            result += (number.charAt(i) - '0');
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("56 65 74 100 99 68 86 180 90"));
    }
}
