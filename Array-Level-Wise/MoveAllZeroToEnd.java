import java.util.*;

public class MoveAllZeroToEnd {
public static void main(String[] args) {
	int arr[] = {1,0,2,0,3,0,4,0,5,0};
        int size = arr.length;

	int j =-1;

	for(int i=0;i<size;i++){
		if(arr[i] == 0){
			j = i;
			break;
		}
	}
	if(j== -1) System.out.println(Arrays.toString(arr));
	

	for(int i= j+1; i<size;i++){
		if(arr[i] != 0){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
	}
	System.out.println(Arrays.toString(arr));
}	
}
