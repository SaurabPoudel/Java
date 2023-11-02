import java.util.*;
public class SearchRange {
  public static int[] searchRange(int[] nums, int target) {
    int start = 0;
    int end = nums.length -1;
    int[] ans = {-1,-1};
    int res1 = -1;
    int res2 = -1;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(nums[mid] == target){
        res1 = mid;
        end = mid -1;
      }else if(nums[mid] < target){
        start = mid + 1;
      }else{
        end = mid -1;
      }
    }
    ans[0] = res1;
    start = 0;
    end = nums.length -1 ;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(nums[mid] == target){
        res2 = mid;
        start = mid + 1;
      }else if(nums[mid] < target){
        start = mid + 1;
      }else{
        end = mid -1;
      }
    }
    ans[1] = res2;
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {5,7,7,8,8,10};
    System.out.println("first and last occurance is"+ Arrays.toString(searchRange(arr,8)));
  }
}
