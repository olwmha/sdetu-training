package basic;

public class Lab1 {
	public static void main(String[] args){
		//Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println(sum(5));
		System.out.println("***************************");
		
		//Write a function that computes the factorial value
		System.out.println("The factorial of 5 is: " + fact(5));
		System.out.println("***************************");
		
		//Write 3 functions returning the minimum, average and maximum of an array
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("The minimum is: " + findMin(numbers));
		System.out.println("The maximum is: " + findMax(numbers));
		System.out.println("The average is: " + findAvg(numbers));
	}
	
	public static int findMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}return min;
	}
	public static int findMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}return max;
	}
	public static int findAvg(int[] arr){
		//takes the sum of the values in the array and divide by the number of elements
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}return sum /arr.length;
	}
	
	
	public static int sum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			System.out.println(sum + " + " + i + " = " + (sum = sum + i));
		}
		return sum;
	}
	//Recursion = continuously calling function until 0 is reached
	public static int fact(int n){
		if(n == 0){
			return 1;
		}
		System.out.println(n);
		return fact(n - 1) * n;
	}
}

