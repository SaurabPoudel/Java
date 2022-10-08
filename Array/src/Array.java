import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter data in array:");
        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
