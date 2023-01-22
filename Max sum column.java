import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matrix[][] = new int[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int maximum_column = Integer.MIN_VALUE;
		for(int j = 0; j < n; j++){
			int sum_column = 0;
			for(int i = 0; i < m; i++){
				 sum_column += matrix[i][j];
			}
			maximum_column = Math.max(maximum_column, sum_column);
		}
		System.out.println(maximum_column);

	}
}
