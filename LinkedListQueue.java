package LinkedListQueue;

public class LinkedListQueue<E> {

	private Node<E> top;
	private Node<E> tail;
	private int size;
	
	private static class Node<E>
	{
		private E element;
		private Node<E> next;
		
		public Node(E element)
		{
			this.element = element;
		}
	}
	
	public LinkedListQueue()
	{
		top = null;
		tail = null;
		size = 0;
	}
	
	public void enqueue(E element)
	{
		Node newNode = new Node(element);
		
		if (size == 0)
		{
			top = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
		
		size++;
	}
	
	public E dequeue()
	{
		if (size == 0)
		{
			return null; 
		}
		
		E removedElement = top.element;
		top = top.next;
		
		if (top == null)
		{
			// queue is empty
			tail = null;
		}
		
		size--;
		return removedElement;
	}
	
	public E peek() {
        if (top == null) {
            return null;
        }
        return top.element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}








