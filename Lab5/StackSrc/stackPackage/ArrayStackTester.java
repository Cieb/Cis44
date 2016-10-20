package stackPackage;

public class ArrayStackTester {

	public static void main(String[] args) {
		StackInterface<String> myStringStack = new ArrayStack<String>();
		StackInterface<Integer> myIntStack = new ArrayStack<Integer>(3);
		
		myStringStack.push("yo");
		myStringStack.push("hi");
		myStringStack.push("no");
		myStringStack.push("name");
		System.out.println(myStringStack.peek());
		myStringStack.pop();
		myStringStack.pop();
		System.out.println(myStringStack.peek());
	
		myIntStack.push(42);
		System.out.println(myIntStack.peek());
		
		myStringStack.clear();
		myIntStack.clear();
		System.out.println(myStringStack.peek());
		

	}

}
