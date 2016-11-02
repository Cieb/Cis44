package queuesLab;
import java.util.*;

import java.util.Arrays;

public class ArrayQueue<T> implements QueueInterface<T>{
	private T[] queue;
	private boolean initialized = false;
	private int endOfLine;
	private int startOfLine = 0;
	private static final int DEFAULT_SIZE = 25;
	private static final int  MAX_SIZE = 1000;
	

	public ArrayQueue()
	{
		this(DEFAULT_SIZE);
	}
	public ArrayQueue(int initialCapacity)
	{
		checkCapacity(initialCapacity);
		
		
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[])new Object[initialCapacity];
		queue = tempQueue;
		initialized = true;
		endOfLine = 0;
	}
	
	
	public void enqueue(T newEntry)
	{
		ensureCapacity();
		queue[endOfLine] = newEntry;
		endOfLine++;
	}
	
	public T dequeue()
	{
		if(isEmpty())
			throw new EmptyQueueException();
		else
		{
		T removedObject = queue[startOfLine] ;
		queue[startOfLine] =null;
		startOfLine++;
		return removedObject;
		}
		
	}
	
	public T getFront()
	{
		
	}
	
	public boolean isEmpty()
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public void checkCapacity(int valueToCheck)
	{
		if (valueToCheck > MAX_SIZE)
		{
			throw new IllegalStateException(
					"Attempt to creat a stack " + "whose capacity exceeds " + "allowed maximum of " + MAX_SIZE);
		}
	}
	
	private void ensureCapacity()
	{
		if(endOfLine == queue.length-1)
		{
			int newLength = 2*queue.length;
			checkCapacity(newLength);
			queue = Arrays.copyOf(queue, newLength);
			
		}
	}

}
