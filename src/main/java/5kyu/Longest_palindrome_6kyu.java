package org.example;

public class Longest_palindrome_6kyu {
    public static int longestPalindrome(final String s) {
        int max = 1;

        if (s.length() == 0){
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String word = s.substring(i, j + 1);
                if (isPalindrome(word)){
                    max = Math.max(max, word.length());
                }
            }
        }

        return max;
    }

    private static boolean isPalindrome(final String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
        System.out.println(longestPalindrome("abb"));
        System.out.println(longestPalindrome("abcde"));
        System.out.println(longestPalindrome("zzbaabcd"));
    }
}
