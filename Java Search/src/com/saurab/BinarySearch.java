package com.saurab;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-9,-6,-2,3,4,7,13,23,30,32,35};//shorted array
        int target =3;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if element doesn't exist
    static int binarySearch(int[] arr,int target){
        int start = 30;
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
        return -1;
    }
}