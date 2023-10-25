import java.util.*;

public class MooreVotingAlgo {
  public static int majorityElement(int[] nums) {
    int elem = 0;
    int count = 0;
    // Moore's Voting Algorithm
    for(int i=0;i<nums.length;i++){
      if(count ==0){
        count = 1;
        elem = nums[i];
      }
      else if(elem == nums[i]) count++;
      else count--;
    }
    // Checking if the element is majority element or not
    int c =0;
    for(int i=0;i<nums.length;i++){
      if(elem == nums[i]){
        c++;
      }
    }
    System.out.println(nums.length/2 + "elem" + elem + "count" + c );
    if(c > nums.length/2){
      return elem;
    }
    return -1;
  }
  public static void main(String args[]) {
    int[] arr ={3,3,4};
    int majority =  majorityElement(arr);
    System.out.println("Majority element is "+ majority);
  }
}
