package workshop7.task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array length: ");
		int length = sc.nextInt();
		
		double[] myArray = new double[length];
		for(int i = 0; i < length; i++) {
			if(i == 0) {
				System.out.print("Please enter 1st double number: ");
			}
			else if(i == 1) {
				System.out.print("Please enter 2nd double number: ");
			}
			else if (i == 2) {
				System.out.print("Please enter 3rd double number: ");
			}
			else if( i >=3 ) {
				System.out.print("Please enter " + (i+1) + "th double number: ");
			}
			
			myArray[i] = sc.nextDouble();
		}
		
		//print out the result:
		System.out.println("The Max of your array is: " + max.arrayProcessor(myArray));
		System.out.println("The Min of your array is: " + min.arrayProcessor(myArray));
		System.out.println("The Sum of your array is: " + sum.arrayProcessor(myArray));
		System.out.println("The Average of your array is: " + avg.arrayProcessor(myArray));
		
		System.out.print("Enter a number: ");
		double count = sc.nextDouble();
		System.out.println("The count of " + count + " in the array is: " + (int)counter(count).arrayProcessor(myArray));
		
	}
	
	
	//find the max
	public static final ArrayProcessor max = array -> {
		double maxNum = array[0];
		for (int i = 0; i < array.length; i++) {
			if( array[i] > maxNum)
				maxNum = array[i];
		}
		return maxNum;
	};
	
	
	
	//find the min
	public static final ArrayProcessor min = array -> {
		double minNum = array[0];
		for (int i = 0; i < array.length; i++) {
			if( array[i] < minNum) {
				minNum = array[i];
			}
		}
		return minNum;
	};
	
	//find the sum
	public static final ArrayProcessor sum = array -> {
		double sumNum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sumNum += array[i];
		}
		return sumNum;
	};
	
	
	//find average
	public static final ArrayProcessor avg = array -> {
		double average = 0.0;
		double sumNum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sumNum += array[i];
		}
		average = sumNum/array.length;
		return average;
	};
	
	
	//counts the number of time s a certain value occurs in an array
		public static ArrayProcessor counter(double value) {
			return array ->{
				int count = 0;
				for(int i = 0; i < array.length; i++) {
					if(array[i] == value) {
						count++;
					}
				}
				return count;
			};
		}
		
	

	
}
