package stackPackage;

public interface StackInterface<T> {
	
	/*add new entry to top of the stack*/
	public void push(T newEntry);
	/*Removes top entry of stack*/
	public T pop();
	/*Retrieves stacks top entry*/
	public T peek();
	/*detects whether this stack is empty*/
	public boolean isEmpty();
	/*removes all entries from this stack*/
	public void clear();
	

}
