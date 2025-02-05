public class Get_the_Middle_Character_7kyu {

    public static String getMiddle(String word) {

        if ("".equals(word)) {
            return "";
        }

        char middleC = word.charAt(word.length() / 2);

        if (word.length() % 2 != 0) {
            return "" + middleC;
        } else if (word.length() % 2 == 0) {
            char middleC1 = word.charAt(word.length() / 2 - 1);
            return middleC1 + "" + middleC;
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println("cat".charAt("cat".length() / 2));
        System.out.println("shop".charAt("shop".length() / 2));
        System.out.println("rectangle".charAt("rectangle".length() / 2));

        System.out.println("haushalt".charAt("haushalt".length() / 2));
        System.out.println("haushalt".charAt("haushalt".length() / 2 - 1));

        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }
}
