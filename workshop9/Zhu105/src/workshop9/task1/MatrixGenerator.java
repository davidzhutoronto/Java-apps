package workshop9.task1;

import java.util.Random;

public class MatrixGenerator {

	public static double[][] buildMatrix(int size){
		double[][] result = new double[size][size];
		Random r = new Random();
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				result[i][j] = r.nextInt(10);
			}	
		}
		return result;
	}
	
	
	public static void print(double[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		for(int i = 0; i< row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
