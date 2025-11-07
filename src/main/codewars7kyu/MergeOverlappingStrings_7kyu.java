package codewars7kyu;

class MergeOverlappingStrings_7kyu {

    public static String merge(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        int max = Math.min(a.length(), b.length());

        for (int len = max; len > 0; len--) {
            if (a.endsWith(b.substring(0, len))) {
                return a + b.substring(len);
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(merge("abcde", "cdefgh"));
        System.out.println(merge("abaab", "aabab"));
        System.out.println(merge("abc", "def"));
        System.out.println(merge("abc", "abc"));
    }
}
