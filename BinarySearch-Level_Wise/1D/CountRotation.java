import java.lang.*;

public class CountRotation {
  public static int countRotation(int[] nums) {
    int low = 0;
    int high = nums.length -1;
    int index = -1;
    int ans = Integer.MAX_VALUE;
    while(low <= high){
      int mid = low + (high - low)/2;
      if (nums[low] <= nums[mid]) {
        if(nums[low] < ans){
          ans = nums[low];
          index = low;
        }
        low = mid + 1;
      }else{
        if(nums[mid] < ans)
          mid = nums[mid];
          index = mid;
        high = mid -1;
      }
    }
    return index;
  }
  public static void main(String[] args) {
    int[] arr = {3,4,5,1,2};
    System.out.println(countRotation(arr) + " times the array is rotated");

  }
}
