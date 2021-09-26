public class MatrixMultiplication {
    public static void main(String args[]) {
    	int rows1 = 3, cols1 = 3, rows2 = 3, cols2 = 3;
    	int a[][]={{1,2,3},{1,2,3},{1,2,3}};    
    	int b[][]={{1,2,3},{1,2,3},{1,2,3}};
    
        int c[][] = new int[rows1][cols2];
    
        if (rows2 != cols1) {
            System.out.println("Multiplication Not Possible");
            return;
        }
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
            	c[i][j]=0;
                for (int k = 0; k < rows2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");  
            }
            System.out.println();    
        }
    }
}