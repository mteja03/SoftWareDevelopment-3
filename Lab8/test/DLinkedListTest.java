import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DLinkedListTest {

	DLinkedList dl;
	
	@Before
	public void setup(){
		dl = new DLinkedList();
	}
	
	@Test
	public void testIsSortedEmpty() {
		assertTrue(dl.isSorted());
	}

	@Test
	public void testIsSortedTrue() {
		dl.addAtTail(1);
		dl.addAtTail(2);
		dl.addAtTail(3);
		dl.addAtTail(5);
		assertTrue(dl.isSorted());
	}
	
	@Test
	public void testIsSortedFalse() {
		dl.addAtTail(1);
		dl.addAtTail(2);
		dl.addAtTail(5);
		dl.addAtTail(4);
		assertFalse(dl.isSorted());
	}
	
	@Test
	public void testSizeEmpty() {
		assertEquals(0,dl.size());
	}

	@Test
	public void testSizeOne() {
		dl.addAtTail(1);
		assertEquals(1,dl.size());
	}
	
	@Test
	public void testSizeThree() {
		dl.addAtTail(1);
		dl.addAtTail(2);
		dl.addAtTail(5);
		assertEquals(3,dl.size());
	}
	
	@Test
	public void testInsertionSortEmpty() {
		
		assertEquals("not implemented",true,dl.isSorted());
	
	}
	
	@Test
	public void testInsertionSortOrdered() {
		dl.addAtTail(1);
		dl.addAtTail(2);
		dl.addAtTail(5);
		dl.insertionSort();
		assertEquals("not implemented",true,dl.isSorted());
	}
	
	@Test
	public void testInsertionSortRandom() {
		dl.addAtTail(3);
		dl.addAtTail(10);
		dl.addAtTail(7);
		dl.addAtTail(1);
		dl.insertionSort();
		assertEquals("not implemented",true,dl.isSorted());
	}
	
}
