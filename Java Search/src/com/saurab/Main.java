package com.saurab;

public class Main {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int target = 4;
        int ans = linearSearch(num,target);
        if (ans == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("Index of target is "+ ans);
        }
    }
    // search in the array: return index of array if found
    // otherwise return -1 if not found
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
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
