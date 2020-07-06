

class StackException extends RuntimeException{    
	public StackException(String err) {
		super(err);
	}
}

public class Stack {

private class Node{
	int element;
	Node next;
	
	public Node(int e, Node n){
		element = e;
		next = n;
	}
}

private Node top;
private int size;

public Stack(){
	top = null;
	size = 0;
}

public boolean isEmpty(){
	return top == null;
}

public int size(){
	return size; 
}

// part 3: complete
public void push(int o){
	Node nptr = new Node (o, null);
    if (top == null)
        top = nptr;
    else
    {
        nptr.next=top;
        top = nptr;
    }
    size++ ;

}

// part 3: complete
public int pop() throws StackException{
	if (isEmpty() )
        throw new StackException("Underflow Exception") ;
    Node ptr = top;
    top = ptr.next;
    size-- ;
    return ptr.element;	
}

// part 3: complete
public int top() throws StackException{
	if (isEmpty() )
        throw new StackException("Underflow Exception") ;
    return top.element;
	}




}
