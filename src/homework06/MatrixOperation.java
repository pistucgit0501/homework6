package homework06;

public class MatrixOperation implements IMatrixOperation {
    public void printMatrix(int [][] array){}
    public int [][] initMatrixWithRandomNumber(int[][] a,int b, int c){return a;}
    public int[][] multiplyWithScalar(int[][] array,int number){
        for (int i = 0; i <array.length ; i++) {
            for(int j=0; j<array[i].length; j++){
                array[i][j]=array[i][j]*number;
            }

        }
        return  array;
    }
    public int[][] sum(int[][] firstarray, int[][] secondarray){
   int [][] result = new [firstarray.length][secondarray[0].length];
        for (int i = 0; i < firstarray.length; i++) {
            for (int j = 0; j < secondarray[0].length; j++) {
                for (int k = 0; k < firstarray[0].length; k++) {
                    result[i][j] += firstarray[i][k] * secondarray[k][j];
                }
            }
        }
        return result;
    }


}
