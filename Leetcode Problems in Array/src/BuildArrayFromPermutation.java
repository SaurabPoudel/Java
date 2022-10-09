import java.util.Arrays;
//Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]
//        Explanation: The array ans is built as follows:
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//        = [0,1,2,4,5,3]
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr ={0,2,1,5,3,4};
        System.out.println(Arrays.toString(permute(arr)));
    }
     static int[] permute(int[] arr){
        int[] temp = new int[arr.length];
         for (int i = 0; i < arr.length; i++) {
             temp[i] = arr[arr[i]];
         }
        return temp;
    }
}