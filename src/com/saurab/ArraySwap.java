package com.saurab;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Before swapping: "+ (Arrays.toString(arr)));
        swap(arr,1,3);
        System.out.println("After swapping: "+ (Arrays.toString(arr)));

    }
    static void swap(int arr[],int index1,int index2){
        int temp= arr[index1];
        arr[index1] =arr [index2];
        arr[index2] = temp;

    }
}
