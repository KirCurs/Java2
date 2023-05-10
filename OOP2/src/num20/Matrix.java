
package num20;
public class Matrix {

    private final int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
    }
    public void filingRing () {
        int repeat = findCentre();
        for (int r = 1; r < repeat; r++) {
            for (int i = r; i < matrix.length - r; i++) {
                for (int j = r; j < matrix[i].length - r; j++) {
                    if (j != matrix[i].length) {
                        matrix[i][j]++;
                    }
                }
            }
        }
    }
    public int findCentre(){
        int i = 0;
        int centreNum;
        if (matrix.length % 2 == 0 && matrix[i].length % 2 == 0) {
            i = matrix.length / 2 - 1;
            centreNum = matrix[i].length / 2;
            return centreNum;

        } else if (matrix.length % 2 != 0 && matrix[i].length % 2 != 0){
            i = (matrix.length / 2) + 1;
            centreNum = i;
            return centreNum;

        } else if (matrix.length % 2 == 0 && matrix[i].length % 2 != 0) {
            i = matrix.length / 2 - 1;
            centreNum = i + 1;
            return centreNum;

        } else {
            i = (matrix.length / 2) + 1;
            centreNum = i + 1;

        }
        return centreNum;
    }
    @Override
    public String toString() {
        String matrixOne = "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixOne += matrix[i][j] + " ";
            }
            matrixOne += "\n";
        }
        return matrixOne;
    }
}
