package org.example;

public class HasSubpattern_6kyu {

    public static boolean hasSubpattern(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String substring = str.substring(i, j);
                if (composeStr(str, substring)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean composeStr(String str, String substring) {
        if (str.length() % substring.length() == 0) {
            int div = str.length() / substring.length();
            String repeated = substring.repeat(div);
            return str.equals(repeated);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSubpattern("a"));
        System.out.println(hasSubpattern("aaaa"));
        System.out.println(hasSubpattern("abababab"));
        System.out.println(hasSubpattern("ababababa"));
    }
}
