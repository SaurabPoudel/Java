public class SecondLargestOptimal {
	public static void main(String ars[]) {
		int arr[] = {1,9,8,99,100,111};
		int size = arr.length;
		int largest = arr[0];
		int sLargest = -1;
		for(int i=1;i<size;i++){
			if(arr[i] > largest){
				sLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > sLargest){
				sLargest = arr[i];
			}
		}
		System.out.println("Second largest element is "+ sLargest);

	}
}
