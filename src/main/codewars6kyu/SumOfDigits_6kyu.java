package codewars6kyu;

class SumOfDigits_6kyu {
    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        }

        return digital_root(addDigits(n));
    }

    private static int addDigits(int n) {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
    }
}
