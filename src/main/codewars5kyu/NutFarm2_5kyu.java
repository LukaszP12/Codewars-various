package codewars5kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NutFarm2_5kyu {

    public static int[] shakeTree(final char[][] tree) {
        int[] nutsPos = getNutsPos(tree);

        List<Integer> landingIndexes = new ArrayList<>();
        for (int nut : nutsPos) {
            int landingPos = fallNut(nut, tree);
            landingIndexes.add(landingPos);
        }

        return landingIndexes.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int fallNut(int nut, char[][] tree) {
        int cPos = nut;
        for (int cLevel = 0; cLevel < tree.length; cLevel++) {
            char cChar = tree[cLevel][cPos];
            if (cChar == '\\') {
                cPos++;
            } else if (cChar == '/') {
                cPos--;
            }

            if (cPos < 0) return 0;
            if (cPos >= tree[0].length) return tree[0].length - 1;
        }
        return cPos;
    }

    private static int[] getNutsPos(char[][] tree) {
        List<Integer> nutsIndexes = new ArrayList<>();

        for (int i = 0; i < tree[0].length; i++) {
            char c = tree[0][i];
            if ('o' == c) {
                nutsIndexes.add(i);
            }
        }

        return nutsIndexes.stream().mapToInt(Integer::intValue).toArray();
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
