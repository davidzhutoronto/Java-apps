package workshop9.task1;



public class ParallelMatrixThread {
	public static void parallelMultiplyMatrix(double[][] a, double[][] b, double[][] result){
		
		for(int i = 0; i < 500; i++) {
			ParallelMatrix task = new ParallelMatrix(result, a, b, i);
			Thread thread = new Thread(task);
			thread.start();
		}		
				
		for(int i = 500; i < 1000; i++) {
			ParallelMatrix task = new ParallelMatrix(result, a, b, i);
			Thread thread = new Thread(task);
			thread.start();
		}	
		
		for(int i = 1000; i < 1500; i++) {
			ParallelMatrix task = new ParallelMatrix(result, a, b, i);
			Thread thread = new Thread(task);
			thread.start();
		
		}	
		
		for(int i = 1500; i < 2000; i++) {
			ParallelMatrix task = new ParallelMatrix(result, a, b, i);
			Thread thread = new Thread(task);
			thread.start();
		
		}
		
	}

}
