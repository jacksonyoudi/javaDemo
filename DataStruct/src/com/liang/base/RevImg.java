package com.liang.base;

public class RevImg {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] A) {
        int length = A.length;
        for (int i = 0; i < length; i++) {
            int[] arr = A[i];
            int arrLength = arr.length;
            int mod = arrLength / 2;
            for (int j = 0; j < mod; j++) {
                int tmp = A[i][arrLength -1 - j];
                A[i][arrLength -1 - j] = A[i][j];
                A[i][j] = tmp;


            }
        }

        for (int i = 0; i < length; i++) {
            int[] arr = A[i];
            int arrLength = arr.length;
            for (int j = 0; j < arrLength; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }
}
