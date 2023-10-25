import java.util.*;


public class sortArrayOf012Better {
 public static void sort(int []nums) {
  int c1=0, c2=0,c0=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i] == 0){
      c0++;
    }else if(nums[i] == 1){
      c1++;
    }else{
      c2++;
    }
  }
  for(int i=0;i<c0;i++){
    nums[i] = 0;
  }
  for(int i = c0; i< c1;i++){
    nums[i] = 1;
  }
  for(int i = c0+c1; i< nums.length;i++){
    nums[i] = 2;
  }
}
  public static void main(String[] args) {
    int[] arr = {2,2,2,1,0,1,1,0,0,0};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
