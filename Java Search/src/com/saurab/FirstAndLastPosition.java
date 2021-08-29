package com.saurab;
//leetcode problem 34 "Medium Level"
public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public  int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]= start;
        ans[1]=end;
        return ans;
    }
    // this function will return the index of value of target
    int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end) {
            // find the middle element
            // int mid = (start + end) can exceed the range of int, so we can do following step
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            }
            if (target == nums[mid]) {
                // potential answer has been found
                ans = mid;
                if(findStartIndex ){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
