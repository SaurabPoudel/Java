import java.util.*;

public class MajorityElement {

  public static int majorityElementBetter(int[] nums)
  {
    int size = nums.length;
    Map<Integer,Integer> mpp = new HashMap<>();
    int c= 0, maxCount = 0;
    for(int i=0;i <size; i++){
      if(mpp.containsKey(nums[i])){
        c= mpp.get(nums[i]) + 1;
      }else{
        c = 1;
      }
      mpp.put(nums[i],c);
      if(c > maxCount) {
        maxCount = c;
        if(maxCount > size/2) return nums[i];
      }
      }
    return -1;
  }
  public static void main(String[] args) {
    int[] nums= {3,2,3};
    int element = majorityElementBetter(nums);
    System.out.println("The majority element is" + element);
  } 
}
