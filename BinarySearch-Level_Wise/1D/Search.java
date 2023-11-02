public class Search {
  public static int search(int[] nums, int target){
    int size = nums.length;
    int start= 0;
    int end= size -1;
    while(start <= end){
       int mid = start + (end - start)/2;

      if (nums[mid] == target) return mid;
      else if(nums[mid] > target) end = mid -1;
      else start = mid + 1;
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,8,9,100,111};
    int target = 8;
    System.out.println("Found "+ target + "in index "+search(arr,target));
  }
}
