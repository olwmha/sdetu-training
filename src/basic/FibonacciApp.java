package basic;

public class FibonacciApp {
	public static void main(String[] args){
		//fibonacci numbers are declared by the sum of the previous two numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(0) + fib(1) = 1
		//fib(3) = fib(1) + fib(2) = 2
		//fib(4) = fib(2) + fib(3) = 3
		System.out.println(fib(4));
	}
	public static int fib(int n){
		if (n == 0){
			return 0;
		}else if (n == 1){
			return 1;
		}return (fib(n - 1) + fib(n - 2));
	}
}
