package task1;

import java.util.Scanner;

public class TestMyInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a positive integer number: ");
		
		int firstValue = input.nextInt();
		
		MyInteger Obj1 = new MyInteger(firstValue);
		
		
		System.out.println("Your first number is: " + Obj1.getValue());	
		System.out.println();
		
		
		System.out.println("The number is even? " + Obj1.isEven());		
		System.out.println("The number is odd? " + Obj1.isOdd());
		System.out.println("The numebr is prime? " + Obj1.isPrime());
		
		System.out.println();
		

		System.out.println("The number is even? (Static Method isEven(int)) " + MyInteger.isEven(firstValue));
		System.out.println("The number is odd? (Static Method isOdd(int)) " + MyInteger.isOdd(firstValue));	
		System.out.println("The number is Prime? (Static Method isPRime(int)) " + MyInteger.isPrime(firstValue));
		
		System.out.println();
		
		
		System.out.println("The number is even? (Static Method isEven(MyInteger)) " + MyInteger.isEven(new MyInteger(firstValue)));
		System.out.println("The number is odd? (Static Method isOdd(MyInteger)) " + MyInteger.isOdd(new MyInteger(firstValue)));
		System.out.println("The number is prime? (Static Method isPrime(MyInteger)) " + MyInteger.isPrime(new MyInteger(firstValue)));
	
		System.out.println();
		
		System.out.print("Please enter a second positive integer number: ");
		int secondValue = input.nextInt();
		MyInteger Obj2 = new MyInteger(secondValue);
		System.out.println("Your second number is: " + Obj2.getValue());	
		System.out.println();
		
		System.out.println("The values are equal? (equals(int))" + Obj1.euqals(secondValue));
		System.out.println("The values are equal? (equals(MyInteger)) " + Obj1.equals(Obj2));
		
		System.out.println();
		
		char[] charArray = {'5','6','9'};
		System.out.println("Convert {'5','6','9'} to an int value: " +  MyInteger.parseInt(charArray));
		
		String myString = "1323123123";
		System.out.println("Covnvert \"1323123123\" into an int value: " + MyInteger.parseInt(myString));
	}

}
