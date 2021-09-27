
public class Trace {
	static int findTrace(int matrix[][], int N)
    {
        int trace = 0;
        for (int j = 0; j < N; j++)
            trace += matrix[j][j];
        return trace;
    }

	public static void main(String[] args) {
    	int matrix[][]={{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};  
		  
    	System.out.println("Trace: " + findTrace(matrix, matrix.length));
	}

}
