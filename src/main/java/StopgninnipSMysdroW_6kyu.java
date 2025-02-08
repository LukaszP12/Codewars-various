public class StopgninnipSMysdroW_6kyu {

    public static String spinWords(String sentence) {
        String[] split = sentence.split("\\s");
        String result = "";

        for (String s : split) {
            if (s.length() >= 5) {
                result += new StringBuilder(s).reverse() + " ";
            } else {
                result += s + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }
}
