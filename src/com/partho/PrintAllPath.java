package com.partho;

import java.util.Arrays;

public class PrintAllPath {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        Backtracking("", arr, 0, 0);
        int[][] NewPath = new int[arr.length][arr[0].length];
        pathMatrix("", arr, 0, 0, NewPath, 1);
    }

    static void allPath2(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // for down
        if (r < maze.length - 1) {
            allPath2(p + 'D', maze, r + 1, c);
        }

        // for right
        if (c < maze[0].length - 1) {
            allPath2(p + 'R', maze, r + 1, c);
        }

        //for up
        if (r > 0) {
            allPath2(p + 'U', maze, r - 1, c);
        }

        // for left
        if (c > 0) {
            allPath2(p + 'L', maze, r, c - 1);
        }
    }

    static void Backtracking(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        // for down
        if (r < maze.length - 1) {
            Backtracking(p + 'D', maze, r + 1, c);
        }

        // for right
        if (c < maze[0].length - 1) {
            Backtracking(p + 'R', maze, r, c + 1);
        }

        //for up
        if (r > 0) {
            Backtracking(p + 'U', maze, r - 1, c);
        }

        // for left
        if (c > 0) {
            Backtracking(p + 'L', maze, r, c - 1);
        }
        maze[r][c] = true;
    }

    static void pathMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        //for down
        if (r < maze.length - 1) {
            pathMatrix(p + 'D', maze, r + 1, c, path, step + 1);
        }

        //for right
        if (c < maze[0].length - 1) {
            pathMatrix(p + 'R', maze, r, c + 1, path, step + 1);
        }

        //for up
        if (r > 0) {
            pathMatrix(p + 'U', maze, r - 1, c, path, step + 1);
        }

        //for left
        if (c > 0) {
            pathMatrix(p + 'U', maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
