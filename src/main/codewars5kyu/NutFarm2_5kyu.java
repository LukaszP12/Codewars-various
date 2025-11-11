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

        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i].length < minLength) {
                minLength = tree[i].length;
            }
        }

        return createResultArray(landingIndexes, minLength);
    }

    private static int fallNut(int level, int nut, char[][] tree) {
        int cPos = nut;

        for (int r = level; r < tree.length; r++) {
            if (cPos < 0) return 0;
            if (cPos >= tree[r].length) return tree[r].length - 1;

            char c = tree[r][cPos];

            if (c == '\\') {
                cPos++;
                if (cPos >= tree[r].length) return tree[r].length - 1;
            } else if (c == '/') {
                cPos--;
                if (cPos < 0) return 0;
            }
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

    private static int[] createResultArray(List<Integer> landingIndexes, int length) {
        int[] output = new int[length];
        Arrays.fill(output, 0);

        for (int i : landingIndexes) {
            if (i >= 0 && i < length) {
                output[i]++;
            }
        }
        return output;
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
