public class SecondLargestBetter {	
	public static void main(String args[]) {
		int arr[] = {1,-99,-5,-6,-8};
		int size = arr.length;
		int great = arr[0];
		for(int i=0;i<size;i++){
			if(great < arr[i]){
				great = arr[i];
			}
		}
		int secondLargest = -99;
		for(int i =0;i<size;i++){
			if(secondLargest < arr[i] && arr[i] != great){
				secondLargest = arr[i];
			}
		}
		System.out.println("Second largest is " + secondLargest);
	}
}
