package eulerProject;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i=1; i<1000;i++) {
			if (i%3==0 || i%5==0) {
				list.add(i);
			}
		}

		int sum=list.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
		

	}

}
