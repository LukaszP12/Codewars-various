public class SumofNumbers {
    public static int GetSum(int a, int b) {
        int lower, higher = 0;

        if (a > b) {
            lower = b;
            higher = a;
        } else {
            lower = a;
            higher = b;
        }

        int sum = 0;
        for (int i = lower; i <= higher; i++) {
            sum += i;
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(GetSum(1, 0));
        System.out.println(GetSum(1, 2));
        System.out.println(GetSum(0, 1));
        System.out.println(GetSum(1, 1));
        System.out.println(GetSum(-1, 0));
        System.out.println(GetSum(-1, 2));
    }

}
