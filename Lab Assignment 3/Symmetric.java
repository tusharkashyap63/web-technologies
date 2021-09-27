class Symmetric {
	static int[][] transpose(int mat[][]) {
		int tr[][] = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                tr[i][j] = mat[j][i];
            }
        }
		return tr;
	}
	
    static boolean isSymmetric(int mat[][]) {
        int tr[][] = transpose(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != tr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSkewSymmetric(int mat[][]) {
        int tr[][] = transpose(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != -tr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {

        int matrix[][] = {{3, 2, 4}, {2, 6, 2}, {4, 2, 3}};
        
        System.out.print("Symmetric: ");
        if (isSymmetric(matrix)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");        	
        }
        
        System.out.print("Skew Symmetric: ");
        if (isSkewSymmetric(matrix)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");        	
        }
    }
}