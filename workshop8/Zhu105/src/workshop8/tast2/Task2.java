package workshop8.tast2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = sc.nextInt();
		
		if(userInput <= 0) {
			System.out.println("Negative numbers are not prime" );
		}else if(userInput == 1) {
			System.out.println("1 is not prime");
		}else if(userInput == 2) {
			System.out.println("2 is a prime number");
		}
		
		else {
			Set<Integer> factors = new HashSet<>();
			
			int upperLimit = userInput/2+1;
			for(int i = 2; i < upperLimit; i++) {
				while(userInput % i == 0) {
					factors.add(i);
					userInput/=i;
				
				}
			}
			
			if(factors.isEmpty()) {
				System.out.println(userInput + " is a prime number");
			}else {
				System.out.println(factors);
			}
		}		
	}

}
