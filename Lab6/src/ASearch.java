public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	/*
	 * Part 2: complete implementation
	 */
	public int linearSearch(String name){
		for(int i=0;i<current;i++)
		{
			if(catalogue[i].getName().equals(name))
				return catalogue[i].getNumber();
		
		}
		return -1;
	}

	/*
	 * Part 4: complete implementation
	 */
	public int binarySearch(int first,int last,String name){
		// your code
		last-=1;
        while (first <=last) { 
            int m = first + (last - first) / 2; 
  
            int res = name.compareTo(catalogue[m].getName()); 
  
            if (res == 0) 
                return catalogue[m].getNumber(); 
  
  
            if (res > 0) 
                first = m + 1; 
  
   
            else
                last = m - 1; 
        } 
  
        return -1; 
       	}

	// helper method
	public int bSearch(String name){
		return binarySearch(0,current,name);
	}
	
	
}
