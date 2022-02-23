package workshop9.task1;

import java.util.Random;

public class Task1 {
	static final int SIZE = 2000;
	public static void main(String[] args) {
		
		Random r = new Random();
		
		//build matrix 1
		double[][] myMatrix1 = new double[SIZE][SIZE];
		myMatrix1 = MatrixGenerator.buildMatrix(SIZE);
		//System.out.println("Matrix 1: ");
		//MatrixGenerator.print(myMatrix1);
		
		//build matrix 2
		double[][] myMatrix2 = new double[SIZE][SIZE];
		myMatrix2 = MatrixGenerator.buildMatrix(SIZE);
		//System.out.println("Matrix 2: ");
		//MatrixGenerator.print(myMatrix2);
		
		
		//showing result for sequential
		double[][] sequentialResult = new double[SIZE][SIZE];	
		
		
		long sequentialStart = System.nanoTime();
		sequentialResult = SequentialMatrix.sequentialMultiplyMatrix(myMatrix1, myMatrix2);
		long sequentialEnd = System.nanoTime();
		long sequentialTime = sequentialEnd - sequentialStart;
		System.out.println("Sequential Time in milliseconds: " + sequentialTime/1000000);
		//System.out.println("Sequential Result: ");
		//MatrixGenerator.print(sequentialResult);
		
		
		double[][] parallelResult = new double[myMatrix1.length][myMatrix2[0].length];
		
		long parallelStart = System.nanoTime();
		ParallelMatrixThread.parallelMultiplyMatrix(myMatrix1, myMatrix2, parallelResult);
		long parallelEnd = System.nanoTime();
		long parallelTime = parallelEnd - parallelStart;
		System.out.println("Parallel Time in milliseconds: " + parallelTime/1000000);
		//MatrixGenerator.print(parallelResult);
		
	}

}
