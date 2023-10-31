public class RecursiveBinarySearch {

  public static int binarySearch(int[] nums,int target, int start, int end) {
    if(start > end) return -1;
    int mid = start + (end - start)/2;
    if(nums[mid] == target) return mid;
    else if(nums[mid] > target) return binarySearch(nums,target,start,mid-1);
    else return binarySearch(nums,target,mid+1,end);
  }

  public static int search(int[] nums, int target) {
    return binarySearch(nums,target,0,nums.length-1);
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int target = 4;
    System.out.println("The index of "+ target+" in array is "+ search(arr,target));
  }
}
