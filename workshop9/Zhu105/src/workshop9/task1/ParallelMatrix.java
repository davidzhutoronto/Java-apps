package workshop9.task1;

public class ParallelMatrix implements Runnable{

	private final double[][] result;
	private double[][] myMatrix1;
	private double[][] myMatrix2;
	private final int row;
	
	public ParallelMatrix(double[][] result, double[][] myMatrix1, double[][] myMatrix2, int row) {
		this.result = result;
		this.myMatrix1 = myMatrix1;
		this.myMatrix2 = myMatrix2;
		this.row = row;
	}

	@Override
	public void run() {
		for(int i = 0; i < myMatrix2[0].length; i++) {
			result[row][i] = 0;
			for(int j = 0; j < myMatrix1[row].length; j++) {
				result[row][i] += myMatrix1[row][j] * myMatrix2[j][i];
			}
		}
	}
}
