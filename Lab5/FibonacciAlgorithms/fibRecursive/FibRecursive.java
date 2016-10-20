package fibRecursive;

public class FibRecursive {
	 static int FibonacciR(int n){
		if(n<=1)
			return 1;
		else
			return FibonacciR(n-1) + FibonacciR(n-2);
		
	}
	
	public static void main(String[] args) {
		int n = 20;
		System.out.println(FibonacciR(n));

	}

}

