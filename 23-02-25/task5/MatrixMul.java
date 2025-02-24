package javapackage;

import java.util.Arrays;

class MatrixMul extends Thread {
    private int[][] a, b, res;
    private int row, n;

    MatrixMul(int[][] a, int[][] b, int[][] res, int row, int n) {
        this.a = a;
        this.b = b;
        this.res = res;
        this.row = row;
        this.n = n;
    }

    public void run() {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                res[row][j] += a[row][k] * b[k][j];
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] res = new int[2][2];

        MatrixMul[] threads = new MatrixMul[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new MatrixMul(a, b, res, i, 2);
            threads[i].start();
        }
        for (MatrixMul t : threads) {
            t.join();
        }

        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}

