public class LowerBound {

  public static int  lowerBound(int[] nums, int target) {
    int start = 0;
    int index = -1;
    int end = nums.length - 1;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(nums[mid] >= target){
        index = mid;
        end = mid -1;
      }else{
        start = mid + 1;
      }
     }
   return index;

  }
  public static void main(String[] args) {
    int[] arr = {3, 5, 8, 15, 19};
    int target = 9;
    System.out.println("Index of lower bound of "+ target + "is "+ lowerBound(arr,target));
  }
}
