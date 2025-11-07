package codewars6kyu;

class MexicanWave_6kyu {

    public static String[] wave(String str) {
        if (str == null) {
            return new String[0];
        }

        String[] output = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            output[i] = str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1);
        }

        return output;
    }

    public static void main(String[] args) {
        for (String s : wave("hello")) {
            System.out.println(s);
        }
    }
}
