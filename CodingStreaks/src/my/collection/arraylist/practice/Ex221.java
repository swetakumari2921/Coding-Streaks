package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex221 {

    static class Cell {
        int row, col, time;

        Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int minimumTimeToRot(ArrayList<ArrayList<Integer>> grid) {
        int rows = grid.size();
        int cols = grid.get(0).size();

        ArrayList<Cell> queue = new ArrayList<>();
        int front = 0;
        int fresh = 0;

        // Store all rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid.get(i).get(j) == 2) {
                    queue.add(new Cell(i, j, 0));
                } else if (grid.get(i).get(j) == 1) {
                    fresh++;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int time = 0;

        while (front < queue.size()) {
            Cell current = queue.get(front++);

            time = Math.max(time, current.time);

            for (int k = 0; k < 4; k++) {
                int nr = current.row + dr[k];
                int nc = current.col + dc[k];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    grid.get(nr).get(nc) == 1) {

                    grid.get(nr).set(nc, 2);
                    fresh--;
                    queue.add(new Cell(nr, nc, current.time + 1));
                }
            }
        }

        return fresh == 0 ? time : -1;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

        grid.add(new ArrayList<>());
        grid.get(0).add(2);
        grid.get(0).add(1);
        grid.get(0).add(1);

        grid.add(new ArrayList<>());
        grid.get(1).add(1);
        grid.get(1).add(1);
        grid.get(1).add(0);

        grid.add(new ArrayList<>());
        grid.get(2).add(0);
        grid.get(2).add(1);
        grid.get(2).add(1);

        System.out.println("Minimum Time: " + minimumTimeToRot(grid));
    }
}