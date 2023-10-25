import java.util.*;

public class TwoSumOptimal {
  public static boolean twoSum(int []arr,int target) {
    Arrays.sort(arr);
    int left = 0, right = arr.length -1;

    while(left < right){
      int sum = arr[left] + arr[right];
      if(sum == target)
      {
        return true;
      }
      else if(sum < target) 
      {
        left++;
      }
      else
      {
        right--;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int[] arr = {2,6,5,8,11};
    int target = 14;
    if(twoSum(arr,target))
    {
      System.out.println("Found");
    }
    else
    {
      System.out.println("Not found");
    }
  }
}
