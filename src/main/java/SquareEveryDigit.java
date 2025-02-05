public class SquareEveryDigit {

    public static int squareDigits(int n) {
        String s = String.valueOf(n);

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += (int) Math.pow(Integer.parseInt("" + s.charAt(i)), 2);
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(765));
    }
}
