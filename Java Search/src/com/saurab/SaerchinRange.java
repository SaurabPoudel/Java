package com.saurab;

public class SaerchinRange {
    public static void main(String[] args) {
        int[] num = {12,4,5,6,7,-4,6};
        int target = 6;
        System.out.println(linearSearch(num,target,1,4));
    }
    static int linearSearch(int[] arr,int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            //check for element in every index if it is equal to target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the above return statements are executed
        // hence the target is not found
        return -1;
    }
}
