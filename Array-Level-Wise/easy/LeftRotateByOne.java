import java.util.*;

public class LeftRotateByOne {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,7,7,7,7,7,7};
		int size = arr.length;
		int firstElement = arr[0];
		for(int j=0;j<size-1;j++){
			arr[j] = arr[j +1];
		}
		arr[size-1] = firstElement;
		System.out.println(Arrays.toString(arr));
	}
}
