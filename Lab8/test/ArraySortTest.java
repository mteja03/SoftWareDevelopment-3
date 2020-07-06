import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArraySortTest {

	@Test
	public void testIsSortedEmpty() {
		int[] arr = {};
		assertTrue(ArraySort.isSorted(arr));
	}

	@Test
	public void testIsSortedTrue() {
		int[] arr = { 1, 2, 3, 67, 78 };
		assertTrue(ArraySort.isSorted(arr));
	}

	@Test
	public void testIsSortedFalse() {
		int[] arr = { 1, 2, 7, 5, 3 };
		assertFalse(ArraySort.isSorted(arr));
	}

	@Test
	public void testIsSortedArrayListEmpty() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertTrue(ArraySort.isSorted(arr));
	}

	@Test
	public void testIsSortedArrayListTrue() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		assertTrue(ArraySort.isSorted(arr));
	}

	@Test
	public void testIsSortedArrayListFalse() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(4);
		assertFalse(ArraySort.isSorted(arr));
	}

	@Test
	public void testInsertionSortOrdered() {
		int[] arr = { 1, 2, 3, 4 };
		// step 1: sort the array with ArraySort.insertionSort(arr)
		ArraySort.insertionSort(arr);
		// step 2: check the length of the array
		assertEquals("length not well",4,arr.length);
		
		// step 2: check if the array is sorted
		assertEquals("sort not done",true,ArraySort.isSorted(arr));
	}
	
	@Test
	public void testInsertionSortRandom() {
		int[] arr = { 4 , 2 , 1 , 8 };
		// step 1: sort the array with ArraySort.insertionSort(arr)

		ArraySort.insertionSort(arr);
		// step 2: check the length of the array
		assertEquals("length not well",4,arr.length);
		
		// step 2: check if the array is sorted
		assertEquals("sort not done",true,ArraySort.isSorted(arr));	}

	@Test
	public void testBubbleSortEmpty() {
		int[] arr = {};
		ArraySort.bubbleSort(arr);
		assertTrue(arr.length == 0);
	}

	@Test
	public void testBubbleSortRandom() {
		int[] arr = { 5, 1, 4, 2, 8 };
		// step 1: sort the array with ArraySort.bubbleSort(arr)
		ArraySort.bubbleSort(arr);
		// step 2: check the length of the array
		assertEquals("length not well",5,arr.length);
		
		// step 2: check if the array is sorted
		assertEquals("sort not done",true,ArraySort.isSorted(arr));	

	}

	@Test
	public void testBubbleSortOrdered() {
		int[] arr = { 1, 2, 3, 4 };
		// step 1: sort the array with ArraySort.bubbleSort(arr)
		ArraySort.bubbleSort(arr);
		// step 2: check the length of the array
				assertEquals("length not well",4,arr.length);
				
				// step 2: check if the array is sorted
				assertEquals("sort not done",true,ArraySort.isSorted(arr));	
	}

	@Test
	public void testQuickSortSorted() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		// step 1: sort the array with ArraySort.quickSort(arr)
		ArraySort.quickSort(arr);
		// step 2: check the length of the array
		assertEquals("not implemented",5,arr.size());

		// step 2: check if the array is sorted
		assertEquals("not implemented",true,ArraySort.isSorted(arr));
	}

	@Test
	public void testQuickSortRandom() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(9);
		arr.add(5);
		// step 1: sort the array with ArraySort.quickSort(arr)
				ArraySort.quickSort(arr);
				// step 2: check the length of the array
				assertEquals("not implemented",5,arr.size());

				// step 2: check if the array is sorted
				assertEquals("not implemented",true,ArraySort.isSorted(arr));	}

	@Test
	public void testQuickSortEmpty() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(3);
		// step 1: sort the array with ArraySort.quickSort(arr)
		ArraySort.quickSort(arr);
		// step 2: check the length of the array
		assertEquals("not implemented",3,arr.size());

		// step 2: check if the array is sorted
		assertEquals("not implemented",true,ArraySort.isSorted(arr));
	}
}
