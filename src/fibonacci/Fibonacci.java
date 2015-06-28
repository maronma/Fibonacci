package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {	
	List<Integer> fibo;
	
	public Fibonacci(){
		fibo = new ArrayList<Integer>();
	}
	
	public List<Integer> fib() {      
        int valueOfElements=19;
        fibo.add(0,1);
        fibo.add(1,1);
        
         for(int i=2; i < valueOfElements; i++){
        	 fibo.add(i, fibo.get(i-1)+fibo.get(i-2));
        	 
         }

         return fibo;
 }

		
	}
	


