package ArrayQueue;

public class ArrayQueue<E> {

	private E[] elements;
	private int top;
	private int tail;
	private int size;
	
	public ArrayQueue()
	{
		this(10);
	}
	
	public ArrayQueue(int capacity)
	{
		elements = (E[]) new Object[capacity];
		top = 0;
		tail = -1;
		size = 0;
	}
	
	public void enqueue(E newElement) throws IllegalStateException
	{
		if (size == elements.length)
		{
			throw new IllegalStateException("Queue is full");
		}
		
		tail = (tail + 1) % elements.length;
		elements[tail] = newElement;
		size++;
	}
	
	public E dequeue()
	{
		if (size == 0)
		{
			return null;
		}
		
		E element = elements[top];
		top = (top + 1) % elements.length;
		size--;
		return element;
	}
	
	public E peek()
	{
		if (size == elements.length)
		{
			throw new IllegalStateException("Queue is full");
		}
		
		E element = elements[top];
		return element;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty() {
        return size == 0;
    }
}









