import java.util.Scanner;

public class Determinant {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter values in matrix: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}		
		}
		sc.close();
		
		int x = (matrix[1][1] * matrix[2][2]) - (matrix[2][1] * matrix[1][2]);
		int y = (matrix[1][0] * matrix[2][2]) - (matrix[2][0] * matrix[1][2]);
		int z = (matrix[1][0] * matrix[2][1]) - (matrix[2][0] * matrix[1][1]);
		
		int determinant = (matrix[0][0] * x) - (matrix[0][1] * y) + (matrix[0][2] * z);

		System.out.println("Determinant: " + determinant);
		
	}
}