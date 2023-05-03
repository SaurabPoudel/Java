/*
* Suppose there is list of numbers [2,3,5,9,14,16,18]
* Ceiling of a number 4 is 5
*Ceiling of a number 16 is 16
* Ceiling of a number 10 is 14
* */
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 9;
        System.out.println(ceilingOfNumber(arr,target));
    }
    static int ceilingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target < arr[mid]){
                ans  = arr[mid];
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return target;
            }
        }
        return ans;
    }
}
