public class MissingNumber {
	public static void main(String[] args) {
 		int arr[] = {1,3,4,5};
		int n = 5;
		int sum = n*(n+1)/2;
		int s = 0;
		for(int i=0;i<n-1;i++){
			s += arr[i];
		}
		System.out.println("Missing number is "+ (sum -s));
	}
}
