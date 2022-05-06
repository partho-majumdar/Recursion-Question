package com.partho;

import java.util.ArrayList;

public class PathObstacle {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathObs("", arr, 0, 0);
        System.out.println(pathObsRet("", arr, 0, 0));
    }

    static void pathObs(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathObs(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathObs(p + 'R', maze, r, c + 1);
        }
    }

    static ArrayList<String> pathObsRet(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list2 = new ArrayList<>();
        if (!maze[r][c]) {
            return list2;
        }
        if (r < maze.length - 1) {
            list2.addAll(pathObsRet(p + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list2.addAll(pathObsRet(p + 'R', maze, r, c + 1));
        }
        return list2;
    }
}
