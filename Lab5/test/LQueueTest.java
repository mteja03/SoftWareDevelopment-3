

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/*
	 * 2: complete the following test methods as specified. 
	 */
	
	@Test
	public void testIsEmpty() {
		assertEquals("Test empty fails",true,q.isEmpty());
		
	}
	
	@Test
	public void testIsEmptyFalse() {
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		assertEquals("Test empty fails",false,q.isEmpty());
	}

	@Test
	public void testSizeEmpty() {
		assertEquals("test size fails", 0,q.size());
	}
	
	@Test
	public void testSizeNonEmpty() {
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		assertEquals("size test fails",3,q.size());
	}

	@Test
	public void testEnqueue() {
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		assertEquals("Enqueue fails",3,q.size());
	}
	
	@Test
	public void testDequeue() {
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		assertEquals("Enqueue fails",10,q.dequeue());
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		assertEquals("Empty test fails",null,q.dequeue());
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		assertEquals("Empty test fails",null,q.front());
	}
}
