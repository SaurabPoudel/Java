 public class UpperBound {
   public static int  upperBound(int[] nums , int target) {
    int start = 0;
    int end = nums.length -1;
    int index = nums.length;
    while (start <= end) {
      int mid = start + (end - start)/2;
      if(nums[mid] > target){
        index = mid;
        end = mid - 1;
      }
      else{
        start = mid + 1;
      }
    }
    return index;
   }

  public static void main(String[] args) {
    int[] arr ={1,2,2,3};
    int[] arr1 = {3,5,8,9,15,19};
    System.out.println("Upper bound index "+ upperBound(arr,2));
    System.out.println("Upper bound index" + upperBound(arr1,20));
 }
 }
