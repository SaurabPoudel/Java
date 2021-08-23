package com.saurab;

import java.util.Arrays;

public class Searchin2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,8},
                {4,-8,9},
                {3,6,9,0,10,11}
        };
        int target = 9;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
