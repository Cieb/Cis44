package stackPackage;

import java.util.*;

public final class ArrayStack<T> implements StackInterface<T> {
	private T stack[];
	private int topOfStack;
	private boolean initialized = false;
	private static final int DEFAULT_SIZE = 5;
	private static final int MAX_CAPACITY = 10000;

	public ArrayStack() {
		this(DEFAULT_SIZE);
	}

	public ArrayStack(int InitializedCapacity) {

		checkCapacity(InitializedCapacity);

		@SuppressWarnings("unchecked")
		T[] tempStack = (T[]) new Object[InitializedCapacity];
		stack = tempStack;
		topOfStack = -1;
		initialized = true;
	}

	public void push(T newEntry) {
		checkInitialization();
		ensureCapacity();
		stack[topOfStack + 1] = newEntry;
		topOfStack++;

	}

	public T pop() {
		checkInitialization();
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			T removedEntry = stack[topOfStack];
			stack[topOfStack] = null;
			topOfStack--;
			return removedEntry;
		}

	}

	public T peek() {
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack[topOfStack];

	}

	public boolean isEmpty() {
		return topOfStack < 0;

	}

	public void clear() {
		while (topOfStack > -1) {
			stack[topOfStack] = null;
			topOfStack--;
		}

	}

	private void checkInitialization() {
		if (!initialized) {
			throw new SecurityException("Stack object to initialized properly");
		}
	}

	private void ensureCapacity() {
		if (topOfStack == stack.length - 1) {
			int newLength = 2 * stack.length;
			checkCapacity(newLength);
			stack = Arrays.copyOf(stack, newLength);
		}
	}

	private void checkCapacity(int valueToCheck) {
		if (valueToCheck > MAX_CAPACITY) {
			throw new IllegalStateException(
					"Attempt to creat a stack " + "whose capacity exceeds " + "allowed maximum of " + MAX_CAPACITY);
		}
	}

}
