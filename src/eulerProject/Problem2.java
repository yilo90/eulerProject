package eulerProject;

import java.util.ArrayList;
import java.util.List;


public class Problem2 implements Problems {
	
	private int result;

	@Override
	public void getSolvingResult() {
		solving();
		System.out.println("Result of Problem 2: "+result);
		
	}

	@Override
	public void solving() {
		List<Integer> evenValues=new ArrayList<Integer>();
		int term=0;
		int valueOfTerm;
		do {	
			valueOfTerm=fibonacciSerie(term);
			if (valueOfTerm%2==0) {
				evenValues.add(valueOfTerm);
			}	
			term++;
			
		} while (valueOfTerm<=4_000_000);
		
		result= evenValues.stream().mapToInt(c->c).sum();
	
	}
	
	static int fibonacciSerie(int n) {
		
		int fibonacci[]=new int[n+2];
		fibonacci[0]=1;
		fibonacci[1]=2;
		
		for (int i = 2; i <= n; i++) {
			
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			
		}
		
		return fibonacci[n];
		
	}

}
