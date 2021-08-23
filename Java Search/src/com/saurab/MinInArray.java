package com.saurab;

public class MinInArray {
    public static void main(String[] args) {
        int[] num = {1,99,-44,55,0,2,3};
        System.out.println(min(num));
    }
    // assume num.length !=0
    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
