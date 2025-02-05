public class BetterThanAverage {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int avg = getAvg(classPoints);

        return avg < yourPoints ? true : false;
    }


    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{2, 3}, 5));
        System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(betterThanAverage(new int[]{100, 90}, 11));
    }

    private static int getAvg(int[] points) {
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        return sum / points.length;
    }

}
