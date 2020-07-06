

import java.util.ArrayList;
import java.util.Iterator;

public class ArraySort {
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > cur) {
				arr[j+1] = arr[j--];
				arr[j+1] = cur;
			}
		}
	}
	
	// Part 3: complete implementation
	public static void bubbleSort(int[] arr){
		boolean swapped = true;
        for (int i = 0; i < arr.length && swapped; i++) {
            swapped = false;
     

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }

       
    }
	
	// Part 5 : complete implementation
	public static void quickSort(ArrayList<Integer> S){
		if (S.size() <= 1) 
	        return ; // Already sorted  

	    ArrayList<Integer> sorted = new ArrayList<Integer>();
	    ArrayList<Integer> lesser = new ArrayList<Integer>();
	    ArrayList<Integer> greater = new ArrayList<Integer>();
	    int pivot = S.get(S.size()-1).intValue();
	    while(!S.isEmpty())
	    {
	    	if(S.get(0).intValue()>pivot)
	    		greater.add(S.get(0));
	    	else if(S.get(0).intValue()<pivot)
	    		lesser.add(S.get(0));
	    	else
	    		sorted.add(S.get(0));
	    	S.remove(0);
	    }
	    quickSort(lesser);
	    quickSort(greater);

	    lesser.addAll(sorted);
	    lesser.addAll(greater);
	  
	    S.addAll(lesser);

	    
	}
	// predicate to check if array is sorted
	public static boolean isSorted(int[] arr){
		for(int i = 0; i < arr.length-1;i++)
			if(arr[i] > arr[i+1])
				return false;
		return true;
	}
	
	// predicate to check if arrayList is sorted
	public static boolean isSorted(ArrayList<Integer> ar){
		Iterator i = ar.iterator();
		int val;
		if(i.hasNext())
			val = (int) i.next();
		else
			return true;
		while(i.hasNext()){
			int nv = (int) i.next();
			if(val > nv)
				return false;
			val = nv;
		}
		return true;
	}
	
	
	/*
	 * Helper printing methods for testing
	 */
	private static void printIntArray(int[] arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	private static void printIntArrayList(ArrayList<Integer> arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}
	

	public static void main(String[] args){
		// testing part1
		int[] arr1 = {5,4,3,2,1};
		bubbleSort(arr1);
		printIntArray(arr1);
		
		// testing part2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(3);
		arr2.add(1);
		arr2.add(6);
		arr2.add(5);
		quickSort(arr2);		
		printIntArrayList(arr2);
		// {5,4,3,5,1};
				
	}
	
}
