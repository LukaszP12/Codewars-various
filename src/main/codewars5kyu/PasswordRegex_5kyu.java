package codewars5kyu;

import java.util.regex.Pattern;

class PasswordRegex_5kyu {

    public static void main(String[] args) {
        Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9]{6,}$");
    }
}
