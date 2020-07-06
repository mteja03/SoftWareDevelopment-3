
public class Sort {

	/*
	 * Part 4: complete method
	 */
	public static void sort(int[] arr){
		PriorityQueue p=new PriorityQueue(20);
		for(int i=0;i<arr.length;i++)
			p.insert(arr[i]);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=p.removeMin();
		}
	}
	
	public static void main(String[] args){
		int[] arr = {53,3,5,2,4,67};
		Sort.sort(arr);
		// should be printed in order
		System.out.println(arr[0]);
		System.out.println(arr[1]);	
		System.out.println(arr[2]);
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println(arr[5]);	
	}
	
}
