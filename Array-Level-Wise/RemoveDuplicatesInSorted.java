import java.util.*;

public class RemoveDuplicatesInSorted {
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,2,2,2,2,3,3,4,4};
		int i = 0;
		for(int j=1;j<arr.length;j++){
			if(arr[j] != arr[i]){
				arr[i+1] = arr[j];
				i++;
			}
		}
	System.out.println("The new array is");
	for(int j=0;j<i+1;j++){
		System.out.println(arr[j] +" ");
	}
	}
}
