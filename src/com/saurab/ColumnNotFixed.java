package com.saurab;

public class ColumnNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {3,2},
                {4,5,6,7,7}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
}
