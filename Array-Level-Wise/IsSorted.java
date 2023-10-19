public class IsSorted {
	public static void main(String args[]) {
		int arr[] = {1,2,3,9,5,6,7};
		for(int i=1; i < arr.length; i++){
			if(arr[i] > arr[i-1]){}
			else{
				System.out.println("Not Sorted");
				return;
			}
		}
		System.out.println("Sorted");
	}
}
