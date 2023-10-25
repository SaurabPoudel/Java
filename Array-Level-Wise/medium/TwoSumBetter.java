import java.util.*;

public class TwoSumBetter {
  public static boolean name(int []arr,int target) {
    HashMap<Integer,Integer> mpp = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      int num = arr[i];
      int moreNeeded = target - num;
      if(mpp.containsKey(moreNeeded)) return true;
    mpp.put(arr[i],i);
  }
  return false;
}

public static void main(String[] args) {
  int[] arr={2,6,5,8,11};
  int target = 1;
  if(name(arr,target)){
    System.out.println("Found");
  }
  else{
    System.out.println("Not Found");
  }
}
}
