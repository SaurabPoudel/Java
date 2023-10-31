public class SearchInsertPosition {
  public static int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int ans = -1;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(nums[mid] == target){
        return mid;
      }else if(nums[mid] > target){
        ans = mid;
        end = mid - 1;
      }else{
        start = mid + 1;
      }

    }
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {3,5,8,9,15,19};
    int[] arr1 = {1,2,4,7};
    System.out.println("Search insert position is " + searchInsert(arr,6));
    System.out.println("Search insert position is" + searchInsert(arr1,2));
  }
}
