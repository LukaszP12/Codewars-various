public class Convert_a_Number_to_a_String_8kyu {

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        System.out.println(numberToString(123));
        System.out.println(numberToString(999));
        System.out.println(numberToString(-100));
        System.out.println(numberToString(-321));
    }
}
