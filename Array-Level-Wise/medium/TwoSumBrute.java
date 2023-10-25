import java.util.*;

public class TwoSumBrute {

  public static boolean TwoSum(int []a, int targetSum) {
    for (int i = 0; i < a.length; i++) {
      for(int j =0; j<a.length;j++){
        if(i == j) continue;
        if(a[i] + a[j] == targetSum) return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = {1,3,9,10};
    int targetSum = 13;
    boolean found = TwoSum(arr,targetSum);
    if(found){
      System.out.println("Found");
    }
    else{
      System.out.println("Not found");
    }
  }
}
