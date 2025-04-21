package io.programms.Arrays.mirrorMatrix;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(getMirrorMatrix(array1)));
    }

    public static int[][] getMirrorMatrix(int[][] matrix) {

        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(j >= matrix.length / 2) {
                    matrix[i][j] = matrix[i][j - count];
                    count = count + 2;
                }
            }
            count = 1;
        }
        return matrix;
    }
}
