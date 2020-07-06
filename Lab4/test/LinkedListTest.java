

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	/*
	 * Part 1: implement these methods
	 */
	@Test
	public void testSizeEmpty() {
		l=new LinkedList();
		int no=l.size();
		assertEquals("empty test fails",-1,no);
	}

	@Test
	public void testSizeMany() {
		l=new LinkedList();
		l.addAtHead(10);
		l.addAtHead(20);
		l.addAtHead(30);
		l.addAtHead(40);
		int no=l.size();
		assertEquals("empty test fails",4,no);
	}

	@Test
	public void testTotalEmpty() {
		l=new LinkedList();
		int tot=l.total();
		assertEquals("empty total test fails",-1,tot);
	}

	@Test
	public void testTotalMany() {
		l=new LinkedList();
		l.addAtHead(10);
		l.addAtHead(20);
		l.addAtHead(30);
		l.addAtHead(40);
		int tot=l.total();
		assertEquals("total test fails",100,tot);
	}
	
	/*
	 * Optional part
	 */
	
	@Test
	public void testReverse() {
		l=new LinkedList();
		l.addAtHead(5);
		l.addAtHead(2);
		l.addAtHead(10);
		l.reverse();
		assertEquals(5, l.removeAtHead());
		assertEquals(2, l.removeAtHead());	
		assertEquals(10, l.removeAtHead());	
	}

}

