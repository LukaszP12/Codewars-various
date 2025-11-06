package codewars7kyu;

class ReverseWords_7kyu {
    public static String reverseWords(final String original) {
        String result = "";
        String currentWord = "";

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (c == ' ') {
                result += new StringBuilder(currentWord).reverse() + " ";
                currentWord = "";
                continue;
            }
            currentWord += original.charAt(i);
        }

        result += new StringBuilder(currentWord).reverse();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
        System.out.println(reverseWords("double  spaces"));
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("apple"));
    }
}
