package com.company;

import java.util.Arrays;

public class Array {

    private int[][] arr;
    private boolean swapColumns;
    private Utility utility;

    public Array() {
        utility = new Utility();
        swapColumns = true;
        arr = new int[10][10];
        arr[0]=new int[]{0,0,0,0,0,0,0,1,0,0};
        arr[1]=new int[]{0,0,0,1,0,0,0,0,1,0};
        arr[2]=new int[]{0,0,0,1,0,0,0,0,0,1};
        arr[3]=new int[]{0,0,0,1,0,0,0,0,0,0};
        arr[4]=new int[]{0,0,0,1,0,0,0,0,0,0};
        arr[5]=new int[]{0,0,0,1,0,0,0,0,0,0};
        arr[6]=new int[]{0,0,0,1,0,0,0,0,0,0};
        arr[7]=new int[]{0,0,0,1,0,0,0,0,0,0};
        arr[8]=new int[]{0,0,0,1,1,1,1,1,0,0};
        arr[9]=new int[]{0,0,0,0,0,0,0,0,0,0};
    }


    public void print() {
        System.out.println("*********************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("*********************************");
    }

    public void rotate() {

        if(swapColumns) {
            reverseColumns();
        }else {
            reverseRows();
        }
    }

    private void reverseColumns() {
        System.out.println("Now calling reverseColumns");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                utility.swapColumns(j,i);
            }
        }
        swapColumns = !swapColumns;
    }

    private void reverseRows() {
        System.out.println("Now calling reverseRows");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                utility.swapRows(i,j);
            }
        }
        swapColumns = !swapColumns;
    }

    private class Utility {

        public void swapRows(int i,int j) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][arr.length - j - 1];
            arr[i][arr.length - j - 1] = temp;
        }

        public void swapColumns(int j, int i) {
            int temp = arr[j][i];
            arr[j][i] = arr[ arr.length - j - 1][i];
            arr[ arr.length - j - 1][i] = temp;
        }

    }
}
