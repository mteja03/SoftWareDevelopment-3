public class Recursion {

	// Part 1: complete
	public static int sum(int n){
		if(n != 0)
        		return n + sum(n-1);
    		else
       		return n;
		
	}

	// Part 1 complete
	public static int multiply(int m, int n){
		if(n == 0)
		      return 0;

		else if(n > 0)
		      return (m+multiply(m, n - 1));

		else if(n < 0)
		      return -multiply(m, -n);
		else
			return -1;


	}
	
	// Part 1: complete
	public static int Fibonacci(int n){
		if (n == 0){
        			return 0;
    		}
		else if (n == 1){
			return 1;
		}
		else
		{
			return(Fibonacci(n - 1) + Fibonacci(n - 2));
		}
	}


}