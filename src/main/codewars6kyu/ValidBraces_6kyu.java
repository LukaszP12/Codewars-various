package codewars6kyu;

import java.util.Set;
import java.util.Stack;

class ValidBraces_6kyu {

    private static final Set<Character> LEFT_BRACES = Set.of('(', '{', '[');
    private static final Set<Character> RIGHT_BRACES = Set.of(')', '}', ']');

    public static boolean isValid(String braces) {
        if (braces == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : braces.toCharArray()) {
            if (LEFT_BRACES.contains(c)) {
                stack.add(c);
            } else if (RIGHT_BRACES.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (matchSides(pop, c)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    private static boolean matchSides(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        } else if (left == '{' && right == '}') {
            return true;
        } else if (left == '[' && right == ']') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));

        String s1 = "([{}])";
        System.out.println(isValid(s1));

        String s2 = "(}";
        System.out.println(isValid(s2));

        String s3 = "[(])";
        System.out.println(isValid(s3));

        String s4 = "[({})](]";
        System.out.println(isValid(s4));
    }
}
