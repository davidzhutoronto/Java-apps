package workshop8.tast1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {

	
	public static void main(String[] args) {
				
		List<Integer> task1List = new LinkedList<>();//create a new linkedlist
		
		//inserts 25 random int from 0 to 100
		for(int i = 0; i < 25; i++) {
			Random r = new Random();
			task1List.add(r.nextInt(101));
		}
		
		task1List.sort(null);
		
		int sum = 0;
		for(int i : task1List) {
			sum += i;
		}
		
		float fpAverage = 0.0f;
		fpAverage = sum/25;
		
		
		System.out.println(task1List);
		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + fpAverage);
		
	}
	
	
}
