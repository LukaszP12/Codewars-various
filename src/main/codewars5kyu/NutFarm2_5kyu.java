package codewars5kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NutFarm2_5kyu {

    public static int[] shakeTree(final char[][] tree) {
        List<int[]> nutIndexes = getNutsPos(tree);
        List<Integer> landingIndexes = new ArrayList<>();

        for (int[] nut : nutIndexes) {
            int landingPos = fallNut(nut[0],
                    nut[1],
                    tree);
            landingIndexes.add(landingPos);
        }

        return landingIndexes.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int fallNut(int level, int nut, char[][] tree) {
        int cPos = Math.max(0, Math.min(nut, tree[level].length - 1));

        for (int cLevel = level; cLevel < tree.length; cLevel++) {
            int width = tree[cLevel].length;
            if (cPos < 0) return 0;
            if (cPos >= width) return width - 1;

            char cChar = tree[cLevel][cPos];

            if (cChar == '\\') cPos++;
            else if (cChar == '/') cPos--;

            if (cPos < 0) return 0;
            if (cPos >= width) return width - 1;
        }

        return cPos;
    }

    private static List<int[]> getNutsPos(char[][] tree) {
        List<int[]> nuts = new ArrayList<>();

        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[i].length; j++) {
                if (tree[i][j] == 'o') {
                    nuts.add(new int[]{i, j});
                }
            }
        }
        return nuts;
    }

    public static void main(String[] args) {
        char[][] tree = {
                " o o o   ".toCharArray(),
                " /    / ".toCharArray(),
                "   /    ".toCharArray(),
                "  /  /  ".toCharArray(),
                "   ||   ".toCharArray(),
                "   ||   ".toCharArray(),
                "   ||   ".toCharArray()
        };

        int[] result = shakeTree(tree);
        System.out.println(Arrays.toString(result));
    }
}
