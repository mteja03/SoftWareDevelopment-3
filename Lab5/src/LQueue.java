public class LQueue {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	public boolean isEmpty(){
		return head == null;
	}
	
	// Part 3: complete
	public int size(){
		return size;
	}
	
	// Part 3: complete
	public void enqueue(Object o){
		Node nptr = new Node(o, null);
        if (tail == null)
        {
            head= nptr;
            tail = nptr;
        }
        else
        {
            tail.next=nptr;
            tail = tail.next;
        }
        size++ ;
	}
	
	// Part 3: complete	
	public Object dequeue() throws QueueException{
		if (isEmpty() )
            throw new QueueException("queue exception");
        Node ptr = head;
        head = ptr.next;        
        if (head == null)
            tail = null;
        size-- ;        
        return ptr.element;
	}
	
	// Part 3: complete
	public Object front() throws QueueException{
		if (isEmpty())
            throw new QueueException("Underflow Exception");
        return head.element;
	}
}
