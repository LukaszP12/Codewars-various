package recursionExamples;

import java.util.ArrayList;
import java.util.List;


public class MazePaths {

    public static List<List<String>> findAllPaths(int[][] maze) {
        List<List<String>> allPaths = new ArrayList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        backtrack(maze, 0, 0, visited, new ArrayList<>(), allPaths);
        return allPaths;
    }

    private static void backtrack(int[][] maze, int x, int y,
                                  boolean[][] visited,
                                  List<String> path,
                                  List<List<String>> allPaths) {
        int n = maze.length;
        int m = maze[0].length;

        if (x < 0 || y < 0 || x >= n || y >= m || maze[x][y] == 1 || visited[x][y]) {
            return;
        }

        path.add("(" + x + "," + y + ")");
        visited[x][y] = true;

        if (x == n - 1 && y == m - 1) {
            allPaths.add(new ArrayList<>(path));
        } else {
            backtrack(maze, x + 1, y, visited, path, allPaths); // down
            backtrack(maze, x - 1, y, visited, path, allPaths); // up
            backtrack(maze, x, y + 1, visited, path, allPaths); // right
            backtrack(maze, x, y - 1, visited, path, allPaths); // left
        }

        // backtrack (remove current step)
        path.remove(path.size() - 1);
        visited[x][y] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        List<List<String>> paths = findAllPaths(maze);
        paths.forEach(System.out::println);
    }
}
