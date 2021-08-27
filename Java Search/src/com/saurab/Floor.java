package com.saurab;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-9,-6,-2,3,4,7,13,23,30,32,35};//shorted array
        int target =20;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    // return the index
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            // find the middle element
            // int mid = (start + end) can exceed the range of int, so we can do following step
            int mid = start + (end - start)/2;
            if(target < arr[mid] ){
                end = mid -1;
            }
            if(target > arr[mid]){
                start = mid +1 ;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        return end;
    }
}
