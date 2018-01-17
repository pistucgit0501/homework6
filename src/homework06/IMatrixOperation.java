package homework06;

public interface IMatrixOperation {
    public void printMatrix(int [][] array);
    public int [][] initMatrixWithRandomNumber(int[][] a, int b, int c );
    public int[][] multiplyWithScalar(int[][] array,int number);
    public int[][] sum(int[][] array, int[][] arraySecond);
}
