import java.util.*;

public class NextPermutation {
  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
  }
  public static void nextPermutation(int[] nums) {
    int size = nums.length;
    int index = -1;
     for(int i=size-2;i>=0;i--){
       if (nums[i] < nums[i+1]) {
        index = i;
        break;
       }
     }
     if (index == -1){
       reverse(nums,0,size-1);
       return;
     }
       for(int i = size-1; i> index; i--){
         if(nums[i] > nums[index]){
           int temp = nums[index];
           nums[index] = nums[i];
           nums[i] = temp;
           break;
         }
       }
       reverse(nums,index+1, size-1);
    }
  public static void main(String[] args) {
    int[] nums = {1,2,3};
    nextPermutation(nums);
    System.out.println("Next permutation is "+ Arrays.toString(nums));
  }
}
