package basics;

public class Adding {
	public static void main (String[] args) {
		System.out.println(sum(10));
		System.out.println(fact(5));
		int[] numbers = {-45, 23, 2, 455, -4533, 91233};
		System.out.println("Min: " +findMin(numbers));
		System.out.println("Max: " +findMax(numbers));
		System.out.println("Avg: " +findAvg(numbers));
	}
	
	public static int findAvg(int[] arr){
		int sum=0;
		for (int k=0; k<arr.length;k++ ){
			 sum= sum + arr[k];
					}
		return sum/arr.length;
	}

	public static int findMax(int[] arr) {
		int max= arr[0];
		for (int i=0; i< arr.length;i++){
			if (arr[i] > max) {
				max= arr[i];
			}
		}
		return max;
	}
	public static int findMin(int[] arr) {
		int min= arr[0];
		for (int i=0; i< arr.length;i++){
			if (arr[i] < min) {
				min= arr[i];
			}
		}
		return min;
	}
	
	public static int sum(int n){
		int sum=0;
		for (int i=1; i <= n; i++){
			System.out.print(sum + "+" + i + "=");
			sum=sum+i;
			System.out.println(sum);
	
		}
		return sum;
	}
	public static int fact(int n){
		if (n==0){
			return 1;
		}
		return fact(n-1)*n;
	}

}
