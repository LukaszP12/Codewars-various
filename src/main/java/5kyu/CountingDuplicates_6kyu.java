package org.example;

import java.util.HashSet;

public class CountingDuplicates_6kyu {
    public static int duplicateCount(String text) {
        HashSet<String> atLeastOnce = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (atLeastOnce.contains("" + c)) {
                duplicates.add("" + c);
            }

            atLeastOnce.add("" + c);
        }

        return duplicates.size();
    }
}
