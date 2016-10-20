package fibIteratively;

public class FibIteratively {
	static int FibonacciIter(int n){
		int fibNumberOne = 1;
		int fibNumberTwo = 1;
		int fibSum = 0;
		
		for(int i = 1; i < n; i++){
			fibSum = fibNumberOne + fibNumberTwo;
			fibNumberOne = fibNumberTwo;
			fibNumberTwo = fibSum;

		}
		return fibSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FibonacciIter(20));
		

	}

}
