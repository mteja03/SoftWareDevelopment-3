import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	/*
	 * Part 1: complete
	 */
	
	PriorityQueue pq;
	
	@Before
	public void setup(){
		pq = new PriorityQueue(20);
	}
	
	@Test
	public void insertTestMin() {
		// insert a few numbers then test pq.min()
		pq.insert(10);
		pq.insert(5);
		pq.insert(20);
		pq.insert(12);
		assertEquals("min not found",5,pq.removeMin());
		
	}
	
	@Test
	public void insertTestSize() {
		// insert a few numbers then test pq.size()
		pq.insert(10);
		pq.insert(5);
		pq.insert(20);
		pq.insert(12);
		assertEquals("size not correct",4,pq.size());
		
	}

	@Test
	public void removeMinTest() {
		// step 1: add a few numbers to pq
		
		// step 2: call pq.removeMin() to check numbers outputted
		//         in ascending order 
		pq.insert(10);
		pq.insert(5);
		pq.insert(20);
		pq.insert(12);
		assertEquals("min romove not done",5,pq.removeMin());
		
	}
	
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}	

