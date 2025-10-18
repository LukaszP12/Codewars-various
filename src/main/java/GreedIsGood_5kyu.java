public class GreedIsGood_5kyu {
    public static int greedy(int[] dice) {
        int[] counts = new int[7];
        for (int d : dice) {
            counts[d]++;
        }

        int total = 0;

        // handle triples
        if (counts[1] >= 3) {
            total += 1000;
            counts[1] -= 3;
        }
        for (int i = 2; i <= 6; i++) {
            if (counts[i] >= 3) {
                total += i * 100;
                counts[i] -= 3;
            }
        }

        // handle remaining ones and fives
        total += counts[1] * 100;
        total += counts[5] * 50;

        return total;
    }
}
