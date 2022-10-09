import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,1};
        System.out.println(Arrays.toString(concatenate(arr)));
    }

    private static int[] concatenate(int[] arr) {
        int[] temp = new int[arr.length*2];
        for(int i=0;i<arr.length*2;i++){
            temp[i] = arr[i%arr.length];
        }
        return temp;
    }
}
