import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ASearchTest {

	ASearch as;
	/*
	 * Part 1: complete unit tests
	 */
	@Before
	public void setup(){
		as = new ASearch();
		as.addEntry(new Entry("Andrew",111));
		as.addEntry(new Entry("Ewen",321));
		as.addEntry(new Entry("Peter",123));
		as.addEntry(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		// test the linear search method for someone who's in the collection
		assertEquals("search not done person avail",321,as.linearSearch("Ewen"));
	}

	@Test
	public void testLinearSearchFail() {
		// test the linear search method for someone who's not in the collection
		assertEquals("person not avail test fails",-1,as.linearSearch("Teja"));
	}
	
	@Test
	public void testBinarySearchOK() {
		// test the binary search method for someone who's in the collection
		assertEquals("search not done person avail",321,as.bSearch("Ewen"));
	}
	
	@Test
	public void testBinarySearchFail() {
		// test the binary search method for someone who's not in the collection
		assertEquals("search not done person avail",-1,as.bSearch("Teja"));
	}

}
