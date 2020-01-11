public class Matrix {

    public double[][] matrix = {{0,0}, {0,0}};

    public Matrix() {
    }

    public Matrix(int size1, int size2) {
        matrix = new double[size1][size2];
    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplyByMinus()
    {
        for(int i=0; i<4; i++)
        {
            matrix[i][0]*=-1;
        }
    }

    public void fillMatrix(GlobalData[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            matrix[i][i] += array[i].HL.matrix[0][0];
            matrix[i][i] += array[i].BL.matrix[0][0];

            matrix[i][i+1] += array[i].HL.matrix[0][1];
            matrix[i][i+1] += array[i].BL.matrix[0][1];

            matrix[i+1][i] += array[i].HL.matrix[1][0];
            matrix[i+1][i] += array[i].BL.matrix[1][0];

            matrix[i+1][i+1] += array[i].HL.matrix[1][1];
            matrix[i+1][i+1] += array[i].BL.matrix[1][1];
        }
    }
}
