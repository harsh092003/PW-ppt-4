public class arr3 {
    public static int[][] transpose(int matrix[][]) {
        int rows= matrix.length;
        int columns= matrix[0].length;
        int requireMatrix[][] = new int[columns][rows];
        for (int row=0 ; row<rows; row++) {
            for (int col = 0; col<columns; col++) {
                requireMatrix[col][row] = matrix[row][col];
            }
        }
        return requireMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] Matrix = transpose(matrix);

        for (int[] row : Matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
    }
}
}

    

