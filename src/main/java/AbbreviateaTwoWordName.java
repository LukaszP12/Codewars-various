public class AbbreviateaTwoWordName {

    public static String abbrevName(String name) {
        String[] split = name.split("\\s");

        return Character.toUpperCase(split[0].charAt(0)) + "." + Character.toUpperCase(split[1].charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("patrick feeney"));
    }
}
