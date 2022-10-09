import java.util.Arrays;

public class RunningSumof1DArray {
    public static void main(String[] args) {
        int[] arr= {1,1,1,1,1};
        System.out.println(Arrays.toString(sum(arr)));
    }
    static int[] sum(int[] arr){
        int[] sum = new int[arr.length];
        int summ=0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
            sum[i] = summ;
        }
        return sum;
    }
}
