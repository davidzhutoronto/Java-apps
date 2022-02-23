package workshop9.task1;

public class SequentialMatrix {

	
	public static double[][] sequentialMultiplyMatrix(double[][] c, double[][] d){

		double[][] result = new double[c.length][d[0].length];
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < d[0].length; j++) {
				for(int k = 0; k < d[0].length; k++) {
					result[i][j] += c[i][k] * d[k][j];
				}	
			}
		}
		return result;
	}
}
