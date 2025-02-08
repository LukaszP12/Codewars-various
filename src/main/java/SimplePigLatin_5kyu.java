public class SimplePigLatin_5kyu {

//    Move the first letter of each word to the end of it,
//    then add "ay" to the end of the word. Leave punctuation marks untouched.

    public static String pigIt(String str) {
        String[] split = str.split("\\s");

        String result = "";

        for (String s : split) {
            result += " " + changeWord(s);
        }

        return result.trim();
    }

    private static String changeWord(String s) {
        if (!Character.isLetter(s.charAt(0))) {
            return s;
        }

        return s.substring(1) + s.substring(0, 1) + "ay";
    }

    public static void main(String[] args) {
        String s = "Pig latin is cool";
        System.out.println(pigIt(s));

        String s1 = "This is my string";
        System.out.println(pigIt(s1));

        String s2 = "Hello world !";
        System.out.println(pigIt(s2));
    }
}
